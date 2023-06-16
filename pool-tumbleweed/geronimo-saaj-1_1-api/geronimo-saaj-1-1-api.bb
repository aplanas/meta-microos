SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: SOAP with Attachments API for Java (SAAJ)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-saaj-1_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "bdf153e2abeb0bfff0bed2c4b0b7854c05d78666c3d9bd2c6fa980ca67edd9e9661dc92424037e01f9e9464db9280626b91a9fe592227dddc17a960c35e3bafe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-saaj-1-1-api \
mvn-org.apache.geronimo.specs-geronimo-saaj-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-saaj-1.1-spec-pom- \
saaj \
saaj-1-1-api \
saaj-api"

RDEPENDS:${PN} += "/usr/bin/sh \
jaf-1-0-2-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
