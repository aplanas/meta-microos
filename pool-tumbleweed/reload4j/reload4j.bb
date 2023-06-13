SUMMARY = "Revival of EOLed log4j 1.x"
DESCRIPTION = "The reload4j project is a fork of Apache log4j version 1.2.17 \
in order to fix most pressing security issues. It is intended \
as a drop-in replacement for log4j version 1.2.17; replacement \
of log4j.jar with reload4j.jar in a build without needing to \
make changes to source code."
LICENSE = "Apache-2.0"

PV = "1.2.20"

RPM_NAME = "reload4j-1.2.20-1.5.noarch.rpm"
RPM_HASH = "397409e2f9df4cbca5e34c0c708e1441dd9717f08eb861c3103aeea9188235caf28931382099ee48912b38bc8cc5b91b4b91f292279572f3a38f5c51e8366025"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j12 \
log4j12-mini \
mvn(ch.qos.reload4j:reload4j) \
mvn(ch.qos.reload4j:reload4j:pom:) \
mvn(log4j:log4j) \
mvn(log4j:log4j:1.2.12) \
mvn(log4j:log4j:1.2.14) \
mvn(log4j:log4j:1.2.16) \
mvn(log4j:log4j:1.2.17) \
mvn(log4j:log4j:12) \
mvn(log4j:log4j:pom:) \
osgi(org.apache.log4j) \
reload4j"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
