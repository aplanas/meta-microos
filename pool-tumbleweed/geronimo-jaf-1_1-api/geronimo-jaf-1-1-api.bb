SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaf-1_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "60203d24c2e58c9c1c58d46ddb349361707dba4bbb8400d5302baea55fb7142de8dcd719c3bd9cf4a3cffd75fb5074837273b5879d6144080b81de721a69b10f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "activation_1_1_api \
activation_api \
geronimo-jaf-1_1-api \
jaf \
jaf_1_1_api \
jaf_api \
mvn(org.apache.geronimo.specs:geronimo-activation_1.1_spec) \
mvn(org.apache.geronimo.specs:geronimo-activation_1.1_spec:pom:)"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
