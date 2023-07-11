SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-j2ee-management-1_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "45a7ef2bfc7150d1785c6cb57e61735a562e887a1459a9aa12419e14f5e4c26da8211d3f375033ca65c87c863aabe1114d58e4a679ec121d5d9e14c38d719c7d"
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
