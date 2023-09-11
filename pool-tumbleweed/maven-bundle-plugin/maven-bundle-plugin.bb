SUMMARY = "Maven Bundle Plugin"
DESCRIPTION = "Provides a maven plugin that supports creating an OSGi bundle \
from the contents of the compilation classpath along with its \
resources and dependencies. Plus a zillion other features."
LICENSE = "Apache-2.0"

PV = "5.1.9"

RPM_NAME = "maven-bundle-plugin-5.1.9-1.1.noarch.rpm"
RPM_HASH = "c3211d18f4dd2890ba3f01e7f04095deb69cbf73b76d39ec5c591f3c43059b3b3579368d997060c86c8d55345fc4ffc756e91d85a08b30babfe5826b93394bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-bundle-plugin \
maven-plugin-bundle \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.felix-maven-bundle-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-biz.aQute.bnd-biz.aQute.bndlib \
mvn-org.apache.felix-org.apache.felix.bundlerepository \
mvn-org.apache.felix-org.apache.felix.utils \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.shared-maven-dependency-tree \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.jdom-jdom \
mvn-org.osgi-osgi.core \
mvn-org.slf4j-slf4j-api \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm
