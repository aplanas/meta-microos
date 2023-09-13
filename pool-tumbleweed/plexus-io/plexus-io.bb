SUMMARY = "Plexus IO Components"
DESCRIPTION = "Plexus IO is a set of plexus components, which are designed for use \
in I/O operations."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "plexus-io-3.4.1-1.1.noarch.rpm"
RPM_HASH = "0395c71a3704ce690753490a8e747a724b83b427e0ffa5ced9358d26993def17563979f7b8038f97ff4816993a9d65bb71ba698bdc8c72e370216237db453c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-io-pom- \
plexus-io"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
