SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: JMS Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jms-1_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "0a09e2bd1e304aa4d1ad11433cbd88e83240548d3c83b624f11e71e21f5c9711d450151ece545871e1c2b9329f12e6f9ac2ae74061dddfcd4470797e51be6b59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jms-1-1-api \
jms \
jms-1-1-api \
jms-api \
mvn-javax.jms-jms \
mvn-javax.jms-jms-pom- \
mvn-org.apache.geronimo.specs-geronimo-jms-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-jms-1.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
