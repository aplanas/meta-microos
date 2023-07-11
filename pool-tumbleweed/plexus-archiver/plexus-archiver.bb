SUMMARY = "Plexus Archiver Component"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0"

PV = "4.2.1"

RPM_NAME = "plexus-archiver-4.2.1-2.9.noarch.rpm"
RPM_HASH = "8b1a64496835f57303f1b368b6aa7a885102a2dc2db54db1fb8b5c99a6b7af9070c36cf1496f4d388318832fa4a01c82b6b6365e690b619634b78fec369edd2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-archiver-pom- \
plexus-archiver"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-compress \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.tukaani-xz"

inherit rpm
