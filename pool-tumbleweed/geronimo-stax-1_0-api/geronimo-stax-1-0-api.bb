SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-stax-1_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "1b7d483cb941a6a9dd7feb4e66934185ce5736d7e6956dbd3b7a48e79b19872f61a35888bc9b807d73a7e2112c4d5e7bd47c4efbbbc702463a87d852d937c04e"
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
