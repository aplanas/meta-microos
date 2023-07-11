SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-el-1_0-api-1.2-36.12.noarch.rpm"
RPM_HASH = "e56f74d9bfb278084a6767c91ed997dba347e584db4db89caca70475ec6788097fdb18d48dedd62cd1469585a99cf01272c7b7949c053282e7274c5b7a201f3f"
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
