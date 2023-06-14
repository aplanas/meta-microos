SUMMARY = "Maven Bundle Plugin"
DESCRIPTION = "Provides a maven plugin that supports creating an OSGi bundle \
from the contents of the compilation classpath along with its \
resources and dependencies. Plus a zillion other features."
LICENSE = "Apache-2.0"

PV = "3.5.1"

RPM_NAME = "maven-plugin-bundle-3.5.1-4.10.noarch.rpm"
RPM_HASH = "4798c7f60626d6198b34001d78d5647a295f8f4a5719aca650e36b6b19933b5918253439f2a8064d65d251a595242851052f81fa787272f2d234410375703469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-bundle \
mvn-org.apache.felix-maven-bundle-plugin \
mvn-org.apache.felix-maven-bundle-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-biz.aQute.bnd-biz.aQute.bndlib \
mvn-net.sf.kxml-kxml2 \
mvn-org.apache.felix-org.apache.felix.bundlerepository \
mvn-org.apache.felix-org.apache.felix.utils \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.maven.shared-maven-dependency-tree \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.osgi-osgi.core \
mvn-org.sonatype.plexus-plexus-build-api \
mvn-xpp3-xpp3"

inherit rpm
