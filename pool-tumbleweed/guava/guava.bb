SUMMARY = "Google Core Libraries for Java"
DESCRIPTION = "Guava is a suite of core and expanded libraries that include \
utility classes, Google's collections, io classes, and much \
much more. \
This project is a complete packaging of all the Guava libraries \
into a single jar.  Individual portions of Guava can be used \
by downloading the appropriate module and its dependencies."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "32.0.1"

RPM_NAME = "guava-32.0.1-1.1.noarch.rpm"
RPM_HASH = "24ee2db8c45c314c77672ea482f8b46da9b788781fc957d5d8f0a70e6d7058629b23cc3c896b26ac65d26479358ff89b88619a827f88eeaf2facba58e97de7b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guava \
mvn-com.google.guava-failureaccess \
mvn-com.google.guava-failureaccess-pom- \
mvn-com.google.guava-guava \
mvn-com.google.guava-guava-pom- \
osgi-com.google.guava"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.code.findbugs-jsr305"

inherit rpm
