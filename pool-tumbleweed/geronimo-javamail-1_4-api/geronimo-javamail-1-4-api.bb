SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-javamail-1_4-api-1.2-37.1.noarch.rpm"
RPM_HASH = "6823fb2848a588f00e40cac7b7be2fea5669edbd74f900124926fae9277a8fe7c2cf07b3d0e6bad373d530e91d1cdc47bb7e72bb6a9bf9b5e8aee1be3e255f8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-javamail-1-4-api \
javamail-1-4-api \
javamail-api \
mvn-org.apache.geronimo.specs-geronimo-javamail-1.4-spec \
mvn-org.apache.geronimo.specs-geronimo-javamail-1.4-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
jaf-1-1-api \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
