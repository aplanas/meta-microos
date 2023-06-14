SUMMARY = "The ssh-external module for maven-wagon"
DESCRIPTION = "The ssh-external module for maven-wagon"
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ssh-external-3.5.3-1.1.noarch.rpm"
RPM_HASH = "1673acec11f8d9b02a3fd4e1fbf1edece3a21ef13ffc72da2f97c810dc257c5dc9ca7290ebc886657d0653fdce72868c126d5816e525d39d4ffb485034129927"
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
