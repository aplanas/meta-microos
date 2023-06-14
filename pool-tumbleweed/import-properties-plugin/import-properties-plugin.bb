SUMMARY = "Istack-commons import properties plugin"
DESCRIPTION = "This package contains the istack-commons import properties Maven Mojo."
LICENSE = "CDDL-1.1 & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "import-properties-plugin-3.0.7-4.4.noarch.rpm"
RPM_HASH = "4fffa457e4650ed25ae7031d1ba531c5d2555a547af8b5ee62b24256ee956b0cb8b450c312c49d0a659ff44e757b72a08b2dd1a525b6421410391469498a2547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "import-properties-plugin \
mvn-com.sun.istack-import-properties-plugin \
mvn-com.sun.istack-import-properties-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven-maven-settings \
mvn-org.apache.maven.resolver-maven-resolver-api \
mvn-org.apache.maven.resolver-maven-resolver-connector-basic \
mvn-org.apache.maven.resolver-maven-resolver-impl \
mvn-org.apache.maven.resolver-maven-resolver-spi \
mvn-org.apache.maven.resolver-maven-resolver-transport-file \
mvn-org.apache.maven.resolver-maven-resolver-transport-wagon \
mvn-org.apache.maven.resolver-maven-resolver-util \
mvn-org.apache.maven.wagon-wagon-http-lightweight \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.eclipse.sisu-org.eclipse.sisu.inject \
mvn-org.jsoup-jsoup"

inherit rpm
