SUMMARY = "Command Line Interface facilitator for Plexus"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "plexus-cli-1.6-5.5.noarch.rpm"
RPM_HASH = "492de740d7951617e0d4df90619cc7704c02a3749bff8fbe581777fbe0705c34eb68eb20e573a73c0dc840a62e5509fe5cc8d59ee4d1b3aaf895fde80ecd98f3"
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
