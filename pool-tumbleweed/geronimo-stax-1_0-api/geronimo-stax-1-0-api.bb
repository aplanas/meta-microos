SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-stax-1_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "d97471975e7824e3b7998002914e2f93eba85f5319c403b4c9c6be4fac35c9b54fdaa701ba9e8f54f7c603010ef24db5f2cf01dd2bfc33c01976779aac51ee37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-stax-1-0-api \
mvn-org.apache.geronimo.specs-geronimo-stax-api-1.0-spec \
mvn-org.apache.geronimo.specs-geronimo-stax-api-1.0-spec-pom- \
stax-1-0-api \
stax-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
