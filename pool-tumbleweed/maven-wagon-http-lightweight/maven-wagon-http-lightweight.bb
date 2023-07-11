SUMMARY = "The http-lightweight module for maven-wagon"
DESCRIPTION = "The http-lightweight module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-http-lightweight-3.5.3-1.2.noarch.rpm"
RPM_HASH = "cb0c512723dc30d22d5b329af065204a456ebac0b527b78418210b3154b7ed49b7a0d57c7d53897697841f89328c22159340c95b8a22bf85fed10d468c7df4ed"
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
