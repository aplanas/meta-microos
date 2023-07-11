SUMMARY = "The ssh-external module for maven-wagon"
DESCRIPTION = "The ssh-external module for maven-wagon"
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ssh-external-3.5.3-1.2.noarch.rpm"
RPM_HASH = "1d34be3db122a6109013f9f73f49930178f68919a1daad869af8c43c225bff7401f72d23da5abd08582b830509b1774d23e465b7d1704fdcdcd85537df7b6362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ssh-external \
mvn-org.apache.maven.wagon-wagon-ssh-external \
mvn-org.apache.maven.wagon-wagon-ssh-external-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.apache.maven.wagon-wagon-ssh-common \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-simple"

inherit rpm
