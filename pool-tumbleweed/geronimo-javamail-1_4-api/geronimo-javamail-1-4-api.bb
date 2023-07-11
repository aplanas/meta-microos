SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-javamail-1_4-api-1.2-36.12.noarch.rpm"
RPM_HASH = "ff572efecaf830cdbb6b540059aa6dc216623f97dbf5d54585927b4a3704dfb7bff4b9e936a44bf8e902faa76dbd1cbd11f143af8b2cafc4d050793376dec4ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-javamail-1-4-api \
javamail-1-4-api \
javamail-api \
mvn-org.apache.geronimo.specs-geronimo-javamail-1.4-spec \
mvn-org.apache.geronimo.specs-geronimo-javamail-1.4-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
jaf-1-1-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
