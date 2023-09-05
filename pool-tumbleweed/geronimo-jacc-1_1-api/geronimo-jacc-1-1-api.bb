SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jacc-1_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "534f0a74f311aae3e5f08181656f9e20178e63b5e684746aad61057c564763a9e8973423d745808c376279d3567c04e668f2c6a82a8ccb98496621b61eee3034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jacc-1-1-api \
jacc-1-1-api \
jacc-api \
mvn-org.apache.geronimo.specs-geronimo-jacc-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-jacc-1.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
servlet-2-5-api \
update-alternatives"

inherit rpm
