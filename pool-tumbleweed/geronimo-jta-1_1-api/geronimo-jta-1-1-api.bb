SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jta-1_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "45bf38dd10f5588e492123138659bc385318544b26f5cf520addb77247d7b2be10f3f9980c495ab05cf15c91d33bbc633a4a09f4668bb7d9c7fbbd2f9056aa23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jta-1_1-api \
jta \
jta_1_1_api \
jta_api \
mvn(javax.transaction:jta) \
mvn(javax.transaction:jta:pom:) \
mvn(org.apache.geronimo.specs:geronimo-jta_1.1_spec) \
mvn(org.apache.geronimo.specs:geronimo-jta_1.1_spec:pom:) \
mvn(org.eclipse.jetty.orbit:javax.transaction) \
mvn(org.eclipse.jetty.orbit:javax.transaction:pom:)"

RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
