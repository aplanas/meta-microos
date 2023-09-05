SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-el-1_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "24e042c1ef56704626f5f7e26ee4efa80883bd3fcbb805cc96a5efcdb9c8c35eb8ef72c3cf930976902fe568c526fda4ac9aba407f87c7fea730d17d65141912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "el-1-0-api \
el-api \
geronimo-el-1-0-api \
mvn-org.apache.geronimo.specs-geronimo-el-1.0-spec \
mvn-org.apache.geronimo.specs-geronimo-el-1.0-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
