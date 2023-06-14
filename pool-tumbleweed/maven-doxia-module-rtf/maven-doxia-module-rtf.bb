SUMMARY = "RTF module for maven-doxia"
DESCRIPTION = "This package provides RTF module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-rtf-1.9.1-6.7.noarch.rpm"
RPM_HASH = "122ed9961609e44ba2d81bf217dbf6c0b3c7f80180bb341876b4483adaba83d8569a442479f99e4c86a77ae5cdc3f70198c06bd6ae4e30ce8bd69f649b659317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-rtf \
mvn-org.apache.maven.doxia-doxia-module-rtf \
mvn-org.apache.maven.doxia-doxia-module-rtf-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations"

inherit rpm
