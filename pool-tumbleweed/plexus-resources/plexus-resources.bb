SUMMARY = "Plexus Resource Manager"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "MIT"

PV = "1.0~a7"

RPM_NAME = "plexus-resources-1.0~a7-2.7.noarch.rpm"
RPM_HASH = "35bdb656d13081ad59f80e26016457dfd4d7c35afc6cacd85e08e49ebfd1ea703670b5b6ed801c666c9f92d79efa065052cd17afd6c206df0fd50acc12cb27e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-resources \
mvn-org.codehaus.plexus-plexus-resources-pom- \
plexus-resources"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
