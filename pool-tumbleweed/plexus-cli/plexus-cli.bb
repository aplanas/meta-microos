SUMMARY = "Command Line Interface facilitator for Plexus"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "plexus-cli-1.6-5.4.noarch.rpm"
RPM_HASH = "81f999867d79f2aefe07bba9d9b8bb399cfc7cd5e096a497a33224869b584704dd7ca0d2082d254c90ca8d6a97db98866f9610bf87f435a1ca9d07e108f683ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-cli \
mvn-org.codehaus.plexus-plexus-cli-pom- \
plexus-cli"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-cli-commons-cli \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
