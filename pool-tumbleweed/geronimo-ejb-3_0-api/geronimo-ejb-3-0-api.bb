SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-ejb-3_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "4a7c748b2fe45bb0adfe4a96a110185849b2c4e333c6382380bf4aa5af03034be5e073bb63a8a9ce48c99d645c6d81c50fde04ec1f9fd9db9ddf7687a797b228"
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
