SUMMARY = "FML module for maven-doxia"
DESCRIPTION = "This package provides FML module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-fml-1.9.1-6.8.noarch.rpm"
RPM_HASH = "7bc6953da5a5e55ba931c75dfea949454a365467a61f5b6a94cafc8e6d746354ce5fb537d93a4166067cfd6dffef1c4f5b344c0c7405b9b8b3e896af96450f5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-fml \
mvn-org.apache.maven.doxia-doxia-module-fml \
mvn-org.apache.maven.doxia-doxia-module-fml-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
