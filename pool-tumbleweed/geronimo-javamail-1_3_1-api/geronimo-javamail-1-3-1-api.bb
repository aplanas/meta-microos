SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: JavaMail API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-javamail-1_3_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "4cf1878aa05003fb21574ae7443da8c9c02cf77c623d4cce5a7c238cc514d44e82d41d8710c716375c6baeb5e457669751a759c7d121e8c438e522fc95ea6b06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-javamail-1-3-1-api \
javamail-1-3-1-api \
javamail-api \
mvn-org.apache.geronimo.specs-geronimo-javamail-1.3.1-spec \
mvn-org.apache.geronimo.specs-geronimo-javamail-1.3.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
jaf-1-0-2-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
