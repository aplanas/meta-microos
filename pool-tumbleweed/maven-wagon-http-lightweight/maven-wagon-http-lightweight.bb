SUMMARY = "The http-lightweight module for maven-wagon"
DESCRIPTION = "The http-lightweight module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-http-lightweight-3.5.3-1.1.noarch.rpm"
RPM_HASH = "f7a4e9e744967c80cb9172baae31ca55e6abd3dca2665b2c8b331e600bf4a28f158d06c49abf045be492486f9bf9109073b727400e74e454451a1d2e38b39883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-http-lightweight \
mvn-org.apache.maven.wagon-wagon-http-lightweight \
mvn-org.apache.maven.wagon-wagon-http-lightweight-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.maven.wagon-wagon-http-shared \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-simple"

inherit rpm
