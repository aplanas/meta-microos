SUMMARY = "Maven Plugin Tool for Java"
DESCRIPTION = "Descriptor extractor for plugins written in Java."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-java-3.6.0-6.1.noarch.rpm"
RPM_HASH = "8b0799a41d254f77dd7c77a89e921acde8c766521b673b9d6a293aac5a976053cfb8c9d3c4af8329210afe4894798835d5d4c253a90d4532b75823a5527b9139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-java \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-java \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-java-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.apache.maven-maven-model \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
