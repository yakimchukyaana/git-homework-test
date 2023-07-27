import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class GoogleTest {

    @Test
    void googleTest() {
        Selenide.open("https://google.com");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search]").shouldHave(Condition.text("https://selenide.org"));
    }
}
