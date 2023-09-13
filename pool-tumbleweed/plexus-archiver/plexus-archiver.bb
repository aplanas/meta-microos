SUMMARY = "Plexus Archiver Component"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0"

PV = "4.8.0"

RPM_NAME = "plexus-archiver-4.8.0-1.1.noarch.rpm"
RPM_HASH = "656e580c09487b499176c6563c839d42f11b7bfba6267ab887da37c8b49dbfa5c984037cc6eb4ec2f9131bb09003170ffca9ea43b309f02c13baa751e7d6f6f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-archiver-pom- \
plexus-archiver"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-javax.inject-javax.inject \
mvn-org.apache.commons-commons-compress \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-api \
mvn-org.tukaani-xz"

inherit rpm
