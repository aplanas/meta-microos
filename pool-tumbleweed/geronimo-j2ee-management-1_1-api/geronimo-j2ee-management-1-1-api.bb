SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-management-1_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "463239ec9cc34824868e997262d3644a62bb53e539b2a5a8c887638cbe6859c7fe31c3fa81bd532288bec56218554074c668ed9c56db650f8cc9d264133d1622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-j2ee-management-1-1-api \
j2ee-management \
j2ee-management-1-1-api \
j2ee-management-api \
mvn-org.apache.geronimo.specs-geronimo-j2ee-management-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-j2ee-management-1.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
ejb-3-0-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
