SUMMARY = "The ssh-common module for maven-wagon"
DESCRIPTION = "The ssh-common module for maven-wagon"
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ssh-common-3.5.3-1.2.noarch.rpm"
RPM_HASH = "fd69c991207dae48b8454876cdae5885b24a0ddb5ece345f2c0b49352d3e22c535293329ed577bb5a4becf31cea69503b5bf127a72f15fc357ed84d5a69ae669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ssh-common \
mvn-org.apache.maven.wagon-wagon-ssh-common \
mvn-org.apache.maven.wagon-wagon-ssh-common-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
