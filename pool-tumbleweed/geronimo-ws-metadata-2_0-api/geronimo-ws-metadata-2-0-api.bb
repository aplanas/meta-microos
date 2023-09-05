SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-ws-metadata-2_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "0c128432e443526000bc8fb74b534337b2546b7c8f08decddec62a3c75b0a1b4410fc3ac8b27fbc910c0efbdc2aa3712dcf9054ea20d6f741ad16a7d7f07400d"
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
