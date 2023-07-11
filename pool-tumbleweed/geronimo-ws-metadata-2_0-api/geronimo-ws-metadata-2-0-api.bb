SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-ws-metadata-2_0-api-1.2-36.12.noarch.rpm"
RPM_HASH = "c6130fe97c3247a92575462f54418bafd7456569b17081be2b83eafada64b89eb05e13bbf2ddb1005c8d8f776425055e11b525d7dbab1398d94e6b16ae8ae452"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-ws-metadata-2-0-api \
mvn-org.apache.geronimo.specs-geronimo-ws-metadata-2.0-spec \
mvn-org.apache.geronimo.specs-geronimo-ws-metadata-2.0-spec-pom- \
ws-metadata-2-0-api \
ws-metadata-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
