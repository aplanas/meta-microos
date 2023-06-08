SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-ws-metadata-2_0-api-1.2-36.11.noarch.rpm"
RPM_HASH = "e5aa865d593ae874ef052526cf9b08a3914b95bac324f39145df7abe548dad1abb4a63930b8483cb2e81edf40a929df3f6a4deba0684ef3d6f08cbc442f41098"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-ws-metadata-2_0-api mvn(org.apache.geronimo.specs:geronimo-ws-metadata_2.0_spec) mvn(org.apache.geronimo.specs:geronimo-ws-metadata_2.0_spec:pom:) ws_metadata_2_0_api ws_metadata_api"
RDEPENDS:${PN} += "/bin/sh java-headless javapackages-filesystem update-alternatives"

inherit rpm
