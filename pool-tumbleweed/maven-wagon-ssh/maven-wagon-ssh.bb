SUMMARY = "The ssh module for maven-wagon"
DESCRIPTION = "The ssh module for maven-wagon"
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-ssh-3.5.3-1.1.noarch.rpm"
RPM_HASH = "4c7c3cd56e2ae122ef58f0e7148d1f866a410385bba48f1840fab7dbbf31588bde0e1f8d936a5c7fa58115afb39354a2e0cb17e015a46d60747be5a7c28482f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-ssh \
mvn(org.apache.maven.wagon:wagon-ssh) \
mvn(org.apache.maven.wagon:wagon-ssh:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.jcraft:jsch) \
mvn(com.jcraft:jsch.agentproxy.connector-factory) \
mvn(com.jcraft:jsch.agentproxy.jsch) \
mvn(org.apache.maven.wagon:wagon-provider-api) \
mvn(org.apache.maven.wagon:wagon-ssh-common) \
mvn(org.codehaus.plexus:plexus-interactivity-api) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.slf4j:slf4j-simple)"

inherit rpm
