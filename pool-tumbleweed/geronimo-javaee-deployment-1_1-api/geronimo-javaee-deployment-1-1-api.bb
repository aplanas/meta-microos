SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-javaee-deployment-1_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "5e67c5acb01520a4c6e7fbba1460939394a0c553ef4ce718378f12660f6dc004098bcae778a5d33a9a84f77e12290b222f184be94aa19355fdd21e54a5b228e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-javaee-deployment-1-1-api \
javaee-deployment-1-1-api \
javaee-deployment-api \
mvn-org.apache.geronimo.specs-geronimo-javaee-deployment-1.1MR3-spec \
mvn-org.apache.geronimo.specs-geronimo-javaee-deployment-1.1MR3-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
