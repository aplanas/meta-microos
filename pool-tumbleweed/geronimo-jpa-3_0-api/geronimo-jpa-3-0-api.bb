SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jpa-3_0-api-1.2-37.1.noarch.rpm"
RPM_HASH = "844557e7bdd9a36ea7ff5b95db28c460a2312afebf7b8a2c653284b0e77edfe052071ddbae69682cc79df20c718e50dd89b912dfe12468a62fc4a15e19aeda8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jpa-3-0-api \
jpa-3-0-api \
jpa-api \
mvn-javax.persistence-persistence-api \
mvn-javax.persistence-persistence-api-pom- \
mvn-org.apache.geronimo.specs-geronimo-jpa-3.0-spec \
mvn-org.apache.geronimo.specs-geronimo-jpa-3.0-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
