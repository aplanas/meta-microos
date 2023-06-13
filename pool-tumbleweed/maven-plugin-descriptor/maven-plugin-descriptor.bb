SUMMARY = "Maven Plugin Description Model"
DESCRIPTION = "Maven plugin descriptor artifact"
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "maven-plugin-descriptor-2.2.1-3.8.noarch.rpm"
RPM_HASH = "16c963f7bd0fd010db37873107dbf7a8956acfcc603833956df940b40d494a3f39cef6d3e70ca84528aece7c45a66d41fcfa9f177d794495e4c548fa0613e18e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-descriptor \
mvn(org.apache.maven:maven-plugin-descriptor) \
mvn(org.apache.maven:maven-plugin-descriptor:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven:maven-artifact) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-container-default)"

inherit rpm
