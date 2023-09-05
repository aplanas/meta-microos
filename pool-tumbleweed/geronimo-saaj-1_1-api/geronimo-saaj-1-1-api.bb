SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: SOAP with Attachments API for Java (SAAJ)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-saaj-1_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "cf62685a4fc95438623018b239a61520cc569e9a7a0abe5d48e1a6764761c9556c9378a9b10784d33a914d9c1c44b577c69ef8cb1a7d16cf3db1934710c3adf1"
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
