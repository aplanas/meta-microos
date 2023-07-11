SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-ejb-3_0-api-1.2-36.12.noarch.rpm"
RPM_HASH = "34d9f38e9d3620aaba93629f8c9ef319f40eeaf2ab86adba5a7675e15e8fb8aa481ebe675dca68f408c05f502616c7c03eae6269d1728e2cbeafd64f6f217548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ejb \
ejb-3-0-api \
ejb-api \
geronimo-ejb-3-0-api \
mvn-org.apache.geronimo.specs-geronimo-ejb-3.0-spec \
mvn-org.apache.geronimo.specs-geronimo-ejb-3.0-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
annotation-1-0-api \
interceptor-3-0-api \
java-headless \
javapackages-filesystem \
jta-1-1-api \
update-alternatives"

inherit rpm
