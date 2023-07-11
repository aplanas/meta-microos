SUMMARY = "The ssh module for maven-wagon"
DESCRIPTION = "The ssh module for maven-wagon"
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ssh-3.5.3-1.2.noarch.rpm"
RPM_HASH = "667de557445b78b9f9d5c6843920c243474cd38602a76b920f46fa75e3c8f2644283169f761b188912e77108fb671dfa79a199a15a8fcdbd6ee94afbfc43d6c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ssh \
mvn-org.apache.maven.wagon-wagon-ssh \
mvn-org.apache.maven.wagon-wagon-ssh-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.jcraft-jsch \
mvn-com.jcraft-jsch.agentproxy.connector-factory \
mvn-com.jcraft-jsch.agentproxy.jsch \
mvn-org.apache.maven.wagon-wagon-provider-api \
mvn-org.apache.maven.wagon-wagon-ssh-common \
mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.slf4j-slf4j-simple"

inherit rpm
