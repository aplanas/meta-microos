SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jta-1_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "1efc6ece91854bd8dd24dec561ef12656028835f9f96d2017c7faef97c954cebc373c65c14c73b0413e30cdc2a74e22b5cf9922083d16d5a6ab4d363c1a16dab"
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
