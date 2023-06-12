SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-el-1_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "d270faf1ed7a9e213d262ad737999006f2ca4096e8d9ad9955c0b170b1fe75e0936bc6a77cde52c8226149a03ee0895b7d62a1726c476c645d20166540552301"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "el_1_0_api \
el_api \
geronimo-el-1_0-api \
mvn(org.apache.geronimo.specs:geronimo-el_1.0_spec) \
mvn(org.apache.geronimo.specs:geronimo-el_1.0_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
