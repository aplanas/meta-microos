SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaf-1_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "5a0c073a573c0075a60b8141b01c67004a9ba92aba51f3920559fe556ca902c6efc630c2b702763f684bcc09e4c67df42959de1af4b5bedfe58a683c99014153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "activation-1-1-api \
activation-api \
geronimo-jaf-1-1-api \
jaf \
jaf-1-1-api \
jaf-api \
mvn-org.apache.geronimo.specs-geronimo-activation-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-activation-1.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
