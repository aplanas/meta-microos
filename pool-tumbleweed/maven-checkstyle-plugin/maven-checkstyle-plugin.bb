SUMMARY = "Plugin that generates a report regarding the code style used by the developers"
DESCRIPTION = "Generates a report on violations of code style and optionally fails the build \
if violations are detected."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-checkstyle-plugin-3.0.0-1.21.noarch.rpm"
RPM_HASH = "3de6994c094220a8c95990c676692a42c79f5010d6f4e9fdf2bd515254cbd431362ff3662031f13db42a21b08b46e54f41f2ed571e0098a043e6262484d5a4e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-checkstyle-plugin \
mvn-org.apache.maven.plugins-maven-checkstyle-plugin \
mvn-org.apache.maven.plugins-maven-checkstyle-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.puppycrawl.tools-checkstyle \
mvn-commons-collections-commons-collections \
mvn-org.apache.maven-maven-artifact \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.doxia-doxia-decoration-model \
mvn-org.apache.maven.doxia-doxia-integration-tools \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.apache.maven.doxia-doxia-site-renderer \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-impl \
mvn-org.apache.velocity-velocity \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.codehaus.plexus-plexus-resources \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-velocity"

inherit rpm
