SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-javamail-1_4-api-1.2-36.11.noarch.rpm"
RPM_HASH = "656292616147f62c102c7a423438457ad9616bf2d5b52646d2ec0971f0afc61589c1c9f83aebcd5af304e6d506abac55fabcf7c7c81f036d19bb90e943ddf08b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-javamail-1-4-api \
javamail-1-4-api \
javamail-api \
mvn-org.apache.geronimo.specs-geronimo-javamail-1.4-spec \
mvn-org.apache.geronimo.specs-geronimo-javamail-1.4-spec-pom-"

RDEPENDS:${PN} += "/bin/sh \
jaf-1-1-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
