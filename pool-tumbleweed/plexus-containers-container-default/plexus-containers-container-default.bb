SUMMARY = "Default Container from plexus-containers"
DESCRIPTION = "Default Container from plexus-containers."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.1.1"

RPM_NAME = "plexus-containers-container-default-2.1.1-4.2.noarch.rpm"
RPM_HASH = "5ddbbb4e2c621fa1993c6ea1baa2b48f3945882997c0528947fe5ba6f2057d47d860561434a61b00c1ca31bfb4de0d7480aaae808cfbb40793856f079d363f86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-containers-component-api \
mvn-org.codehaus.plexus-containers-component-api-pom- \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-container-default-pom- \
plexus-containers-container-default"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-junit-junit \
mvn-org.apache.xbean-xbean-reflect \
mvn-org.codehaus.plexus-plexus-classworlds \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-commons"

inherit rpm
