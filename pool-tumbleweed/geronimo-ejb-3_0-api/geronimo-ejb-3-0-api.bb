SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-ejb-3_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "db5190a5dff60a061da1a5426e9ecb1a21bc0f37413138f02d7d5164fe252e39f5ebeed2c018db43ca8b9ce3c61985979678f6dae98c8d5f4c33e9e6332f013d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ejb \
ejb-3-0-api \
ejb-api \
geronimo-ejb-3-0-api \
mvn-org.apache.geronimo.specs-geronimo-ejb-3.0-spec \
mvn-org.apache.geronimo.specs-geronimo-ejb-3.0-spec-pom-"

RDEPENDS:${PN} += "/bin/sh \
annotation-1-0-api \
interceptor-3-0-api \
java-headless \
javapackages-filesystem \
jta-1-1-api \
update-alternatives"

inherit rpm
