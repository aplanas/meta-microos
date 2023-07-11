SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: JMS Specification"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jms-1_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "dba3424057bcd07a86f5aeb0af7bfaceb6875ce5e8325f1e1933ef38cb313046929df091e4385882b3cffa529a902a853f8087d272e9a8f0d09ac2d7143cb42f"
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
