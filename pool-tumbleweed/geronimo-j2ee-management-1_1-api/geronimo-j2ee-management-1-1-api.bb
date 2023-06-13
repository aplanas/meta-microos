SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-management-1_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "0a98d3d4a70ef8ff506efcad001d28afb807c01a3b986af0eadeb36e5537a135a3c577dd8d5bcefae2f4925f042e3a5656352e2eda2e5701d89f30cf1efe29c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-j2ee-management-1_1-api \
j2ee-management \
j2ee_management_1_1_api \
j2ee_management_api \
mvn(org.apache.geronimo.specs:geronimo-j2ee-management_1.1_spec) \
mvn(org.apache.geronimo.specs:geronimo-j2ee-management_1.1_spec:pom:)"

RDEPENDS:${PN} += "/bin/sh \
ejb_3_0_api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
