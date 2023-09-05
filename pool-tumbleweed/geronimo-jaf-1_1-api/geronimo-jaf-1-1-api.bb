SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaf-1_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "855a677ec6b6e3917bee95fcb80484bd97113490d3aee02ac7fc44f9b0d5b49ad285feae4303ea1a8f05ac23150c5e6e8986fd1653f1a8ddee1b01e89883628d"
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
