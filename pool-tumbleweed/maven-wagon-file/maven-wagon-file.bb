SUMMARY = "The file module for maven-wagon"
DESCRIPTION = "The file module for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-file-3.5.3-1.2.noarch.rpm"
RPM_HASH = "7f8a4406a063cede9e33be655cca9e731615b5d98707e765470f86255c5bb93fdea68b20f6f889ed991e03ebeadd8dc8206c7cd0ca5b6b3673c10538f49c6cf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-file \
mvn-org.apache.maven.wagon-wagon-file \
mvn-org.apache.maven.wagon-wagon-file-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-simple"

inherit rpm
