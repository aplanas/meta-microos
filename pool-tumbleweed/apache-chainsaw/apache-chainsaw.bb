SUMMARY = "Apache Chainsaw"
DESCRIPTION = "Graphical Viewer for Logging events from a local or remote log4j event system."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "apache-chainsaw-2.1.0-3.11.noarch.rpm"
RPM_HASH = "165185364afaf6ed011d4431ef62b05434e7481efbb39b395233224fd69e656ad3454cdef797cdd72a048886fe470b4d6c30d6effde43f13d9c8818fbdb1a485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-chainsaw \
chainsaw \
mvn-log4j-apache-chainsaw \
mvn-log4j-apache-chainsaw-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
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
