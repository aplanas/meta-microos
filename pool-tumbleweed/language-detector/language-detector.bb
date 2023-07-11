SUMMARY = "Language Detection Library for Java"
DESCRIPTION = "A language detector / language guesser library in Java."
LICENSE = "Apache-2.0"

PV = "0.6"

RPM_NAME = "language-detector-0.6-2.15.noarch.rpm"
RPM_HASH = "00b3374d8fd8b80aa4b38776d3ec6e524436a7fe127015b4e5780fd14d6b45267c44e5c6baa9fe83fb4fe54a694913b693b1ab60fac2fc7fa1a94d3e94e49da9"
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
