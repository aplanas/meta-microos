SUMMARY = "The ssh-common module for maven-wagon"
DESCRIPTION = "The ssh-common module for maven-wagon"
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ssh-common-3.5.3-1.1.noarch.rpm"
RPM_HASH = "4f28ad62f6a22737e4620104f947c120a47c33f53869ba45fe5ba899cb98640e5c885659e9d72d97229ad44082ca936f70d1e9d1cc44cb16fd2182c3ae7600fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ssh-common \
mvn(org.apache.maven.wagon:wagon-ssh-common) \
mvn(org.apache.maven.wagon:wagon-ssh-common:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.wagon:wagon-provider-api) \
mvn(org.codehaus.plexus:plexus-interactivity-api) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
