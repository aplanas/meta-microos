SUMMARY = "JBoss Marshalling OSGi Bundle"
DESCRIPTION = "JBoss Marshalling OSGi Bundle."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-osgi-1.4.11-1.21.noarch.rpm"
RPM_HASH = "ccc181ec704a7bbecd516cf531f72d06fd610e1619272a48dd1e0e73252de48afc6210c5cc38ab2157615eb13e8ba9501ba8bda9a5b6e45fc0a7207ed4d7f270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling-osgi \
mvn-org.jboss.marshalling-jboss-marshalling-osgi \
mvn-org.jboss.marshalling-jboss-marshalling-osgi-pom- \
osgi-org.jboss.marshalling.jboss-marshalling-osgi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jboss.marshalling-jboss-marshalling \
mvn-org.jboss.marshalling-jboss-marshalling-river \
mvn-org.jboss.marshalling-jboss-marshalling-serial"

inherit rpm
