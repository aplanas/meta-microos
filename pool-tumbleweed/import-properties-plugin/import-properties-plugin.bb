SUMMARY = "Istack-commons import properties plugin"
DESCRIPTION = "This package contains the istack-commons import properties Maven Mojo."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "import-properties-plugin-3.0.7-4.5.noarch.rpm"
RPM_HASH = "c8b3cc7ab3145fe0774136c20f09ff5f04917aeb600223b24467dba5dde74c22b88ac66ce2906729a78d2c564cb20c0b44d9db0273cbcfa47fd2181342bc8d05"
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
