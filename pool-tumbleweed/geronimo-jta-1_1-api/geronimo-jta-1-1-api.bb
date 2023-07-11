SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jta-1_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "6e0ef5779215c04191a7e2c1c4d367803025328583733d6e30ed084f4be011c941cc380908a35fc3f1fae9d5da10e77fac67ab5cb2aae6ffa4d3e3732b7162be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jta-1-1-api \
jta \
jta-1-1-api \
jta-api \
mvn-javax.transaction-jta \
mvn-javax.transaction-jta-pom- \
mvn-org.apache.geronimo.specs-geronimo-jta-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-jta-1.1-spec-pom- \
mvn-org.eclipse.jetty.orbit-javax.transaction \
mvn-org.eclipse.jetty.orbit-javax.transaction-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
