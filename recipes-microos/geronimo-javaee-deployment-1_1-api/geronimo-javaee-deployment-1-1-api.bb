SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-javaee-deployment-1_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "40318419e4be6bc444414c786b50984cd96391c0f06eea5479b176eb01517aea981101feb695fbf0faa0bb352396cf468e04b5ebfbcdd3592167be56823d3851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-javaee-deployment-1_1-api \
javaee_deployment_1_1_api \
javaee_deployment_api \
mvn(org.apache.geronimo.specs:geronimo-javaee-deployment_1.1MR3_spec) \
mvn(org.apache.geronimo.specs:geronimo-javaee-deployment_1.1MR3_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
