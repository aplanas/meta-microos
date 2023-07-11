SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jacc-1_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "4a89a935d4b54a88a21137f31fbdbe821c6dd54b4b5abdfcd09a284796db537c35c9900cb09dd92fdf4e1babd589893154dd02092c9b1dc7f0a3ac3d9de135ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jacc-1-1-api \
jacc-1-1-api \
jacc-api \
mvn-org.apache.geronimo.specs-geronimo-jacc-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-jacc-1.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
servlet-2-5-api \
update-alternatives"

inherit rpm
