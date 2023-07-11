SUMMARY = "Maven Plugin Tool for Java"
DESCRIPTION = "Descriptor extractor for plugins written in Java."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-java-3.6.0-5.2.noarch.rpm"
RPM_HASH = "4570984aee0099d053c659998b0563351f8cade0646cf5f9b7ea046bc95c8a9c52df2811199f15a1acbc3c9ed8839aa598fd6df7e5d72369e1767ca2af3703d8"
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
