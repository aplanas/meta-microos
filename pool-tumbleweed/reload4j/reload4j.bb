SUMMARY = "Revival of EOLed log4j 1.x"
DESCRIPTION = "The reload4j project is a fork of Apache log4j version 1.2.17 \
in order to fix most pressing security issues. It is intended \
as a drop-in replacement for log4j version 1.2.17; replacement \
of log4j.jar with reload4j.jar in a build without needing to \
make changes to source code."
LICENSE = "Apache-2.0"

PV = "1.2.20"

RPM_NAME = "reload4j-1.2.20-1.6.noarch.rpm"
RPM_HASH = "c87486d2ee6dff4e5c2526ffbb4f24767a2cf4826cfa7bd0061cfa039537a4ab2baae14417ed2f674f516ed481b81b9367c499ac6e8d189d64f4e01598f14e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j12 \
log4j12-mini \
mvn-ch.qos.reload4j-reload4j \
mvn-ch.qos.reload4j-reload4j-pom- \
mvn-log4j-log4j \
mvn-log4j-log4j-1.2.12 \
mvn-log4j-log4j-1.2.14 \
mvn-log4j-log4j-1.2.16 \
mvn-log4j-log4j-1.2.17 \
mvn-log4j-log4j-12 \
mvn-log4j-log4j-pom- \
osgi-org.apache.log4j \
reload4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
