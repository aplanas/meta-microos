SUMMARY = "Maven Resources Plugin"
DESCRIPTION = "The Resources Plugin handles the copying of project resources \
to the output directory."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-resources-plugin-3.2.0-3.8.noarch.rpm"
RPM_HASH = "7945334cb1d709dc30a2f82f21e723fdf73566174287467de0ed1a2b38f02d634fa6beba206390c4883c9c7006262271f950d579da6e710c982d7d538911d2a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resources-plugin \
mvn-org.apache.maven.plugins-maven-resources-plugin \
mvn-org.apache.maven.plugins-maven-resources-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.shared-maven-filtering \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-interpolation \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus"

inherit rpm
