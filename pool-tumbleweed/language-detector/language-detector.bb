SUMMARY = "Language Detection Library for Java"
DESCRIPTION = "A language detector / language guesser library in Java."
LICENSE = "Apache-2.0"

PV = "0.6"

RPM_NAME = "language-detector-0.6-2.14.noarch.rpm"
RPM_HASH = "b69727e01d7739d98f023068accee00f110e595ca80731f87622e4fc965f545fceea1e4a3b8421fa894dd728ca9cb7425555c116444e2f31106b8c485bf94802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "language-detector \
mvn-com.optimaize.languagedetector-language-detector \
mvn-com.optimaize.languagedetector-language-detector-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-com.intellij-annotations \
mvn-org.slf4j-slf4j-api"

inherit rpm
