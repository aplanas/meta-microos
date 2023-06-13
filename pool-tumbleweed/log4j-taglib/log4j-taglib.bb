SUMMARY = "Apache Log4j Tag Library"
DESCRIPTION = "Apache Log4j Tag Library for Web Applications."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-taglib-2.17.2-5.7.noarch.rpm"
RPM_HASH = "636b92cdeb81fdc5d34ad2e62e4a9fe8a395de6024cb78295f69fa3aa823298f8e1628280e4dd9586481c27bdef833f22e8b1f00ac5b03ef769fa5a49267824e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-taglib \
mvn(org.apache.logging.log4j:log4j-taglib) \
mvn(org.apache.logging.log4j:log4j-taglib:pom:) \
osgi(org.apache.logging.log4j.taglib)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.logging.log4j:log4j-api)"

inherit rpm
