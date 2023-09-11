SUMMARY = "Maven Plugin Tool for Java"
DESCRIPTION = "Descriptor extractor for plugins written in Java."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-java-3.6.0-7.1.noarch.rpm"
RPM_HASH = "a37e3b6f172b7662c6e4fa9de7d61e74f577bd86caa41ed5797552458e83234c1c60397c3a6f5734f4087730ed61849ff349bd9b5795fd149ad6bef013805ab1"
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
