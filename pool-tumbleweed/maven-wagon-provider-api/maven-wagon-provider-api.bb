SUMMARY = "The provider-api module for maven-wagon"
DESCRIPTION = "The provider-api module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-provider-api-3.5.3-1.1.noarch.rpm"
RPM_HASH = "9888078f3f311ba720d833b7d0247c0ad49b4a069692151e7a8eaaf78a2a5e8e7254c396790b8f18f47f57718686604f6587dc774f5e666bf9cf9d81ef7a93dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-provider-api \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.apache.maven.wagon-wagon-provider-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
