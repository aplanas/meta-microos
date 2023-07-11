SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications Note: You should use the subpackages for the \
Specifications that you actually need.	The ones installed by the main \
package are deprecated and will disapear in future releases."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-stax-1_0-api-1.2-36.12.noarch.rpm"
RPM_HASH = "f5715499a97bb836f18e62f94b1a704476248aa0657ccd52aa924ba29ccd9bef728551287d7f9479b29136e55943952b37f75c8a9d7dd52acae56ac002859016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-stax-1-0-api \
mvn-org.apache.geronimo.specs-geronimo-stax-api-1.0-spec \
mvn-org.apache.geronimo.specs-geronimo-stax-api-1.0-spec-pom- \
stax-1-0-api \
stax-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
