SUMMARY = "Maven Plugin Tool for Annotations"
DESCRIPTION = "This package provides Java 5 annotation tools for use with Apache Maven."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-annotations-3.6.0-5.1.noarch.rpm"
RPM_HASH = "ee945b46e7f4554b06a57b383278b39777cc91e8c7e27c14a51e497ede7db886168092d53224a7dc617da4cd693f95072a2a66b2ed77d550bce19646fee51e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-annotations \
mvn(org.apache.maven.plugin-tools:maven-plugin-tools-annotations) \
mvn(org.apache.maven.plugin-tools:maven-plugin-tools-annotations:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.thoughtworks.qdox:qdox) \
mvn(org.apache.maven.plugin-tools:maven-plugin-tools-api) \
mvn(org.apache.maven:maven-compat) \
mvn(org.codehaus.plexus:plexus-archiver) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.ow2.asm:asm)"

inherit rpm
