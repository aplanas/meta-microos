SUMMARY = "Apache Log4j Tag Library"
DESCRIPTION = "Apache Log4j Tag Library for Web Applications."
LICENSE = "Apache-2.0"

PV = "2.17.2"

RPM_NAME = "log4j-taglib-2.17.2-5.8.noarch.rpm"
RPM_HASH = "fceab0b15dd00a057dc35f65678b240f8c56727c06f5c3153ea244a60449544924d16803901c1ed638064eb13e70b43148db52c17f7f1d6512ac711858877c28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j-taglib \
mvn-org.apache.logging.log4j-log4j-taglib \
mvn-org.apache.logging.log4j-log4j-taglib-pom- \
osgi-org.apache.logging.log4j.taglib"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.logging.log4j-log4j-api"

inherit rpm
