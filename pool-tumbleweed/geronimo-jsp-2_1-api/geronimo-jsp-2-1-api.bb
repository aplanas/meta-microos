SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jsp-2_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "f9b3e83cee23ed6ea82a09d8febf5ce5e9fd90de2dc5e6994c90a3e4ba7d4c8a116d5d8dbb07895ebfe0dbcfa3d110a550a121f7a2a47527610a55a834474e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jsp-2-1-api \
jsp \
jsp-2-1-api \
jsp-api \
mvn-org.apache.geronimo.specs-geronimo-jsp-2.1-spec \
mvn-org.apache.geronimo.specs-geronimo-jsp-2.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
el-1-0-api \
java-headless \
javapackages-filesystem \
servlet-2-5-api \
update-alternatives"

inherit rpm
