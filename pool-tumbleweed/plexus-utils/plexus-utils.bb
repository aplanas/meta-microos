SUMMARY = "Plexus Common Utilities"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-1.1 & Apache-2.0 & xpp & BSD-3-Clause & SUSE-Public-Domain"

PV = "3.5.1"

RPM_NAME = "plexus-utils-3.5.1-1.1.noarch.rpm"
RPM_HASH = "e19767499a7674315d06998793326106a50ca58bead40513acf6fd62e3357f2c15667ead7014522444f0f24f85413469e6d3b229713b96667c150a60ba42f466"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.codehaus.plexus:plexus-utils:pom:) \
mvn(plexus:plexus-utils) \
mvn(plexus:plexus-utils:pom:) \
osgi(org.codehaus.plexus.utils) \
plexus-utils"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
