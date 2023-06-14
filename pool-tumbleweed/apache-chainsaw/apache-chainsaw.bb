SUMMARY = "Apache Chainsaw"
DESCRIPTION = "Graphical Viewer for Logging events from a local or remote log4j event system."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "apache-chainsaw-2.1.0-3.10.noarch.rpm"
RPM_HASH = "bbf6c3bedfbb1d39bfa1066b797de47677a01043cbd8f690e71f72ce5f149df018750e876f04116e0d4c2abbe972967a9a10b039f1c15034bbc26dc96f017b81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-chainsaw \
chainsaw \
mvn-log4j-apache-chainsaw \
mvn-log4j-apache-chainsaw-pom-"

RDEPENDS:${PN} += "/bin/bash \
apache-commons-logging \
apache-commons-vfs2 \
apache-log4j-extras \
java-headless \
javapackages-filesystem \
javapackages-tools \
jmdns \
jsch \
mvn-com.jcraft-jsch \
mvn-com.thoughtworks.xstream-xstream \
mvn-commons-logging-commons-logging \
mvn-javax.jmdns-jmdns \
mvn-log4j-apache-log4j-extras \
mvn-log4j-log4j \
mvn-org.apache.commons-commons-vfs2 \
reload4j \
slf4j \
xpp3 \
xpp3-minimal \
xstream"

inherit rpm
