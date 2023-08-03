SUMMARY = "Maven Plugin Tool for Annotations"
DESCRIPTION = "This package provides Java 5 annotation tools for use with Apache Maven."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-annotations-3.6.0-6.1.noarch.rpm"
RPM_HASH = "b1cc3d2febe380c3dd5c6254c0f4585487c40e7943de666b3c4255a4611d483859362dfa4e0e3a81223f051baf135ca631e4e3ffcddbd981190549b5a0709c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.ow2.asm-asm"

inherit rpm
