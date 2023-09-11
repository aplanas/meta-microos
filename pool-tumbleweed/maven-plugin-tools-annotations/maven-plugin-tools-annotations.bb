SUMMARY = "Maven Plugin Tool for Annotations"
DESCRIPTION = "This package provides Java 5 annotation tools for use with Apache Maven."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-annotations-3.6.0-7.1.noarch.rpm"
RPM_HASH = "fb1b5e81c7da6b18d53e582bfd4f86297cd85ae3ce04671ec9ab62ac01a521f771eb2f78f5e060142c1aeb712d9e60ba22ae1c0cda96786c7efc5f9b2011498a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-annotations-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.ow2.asm-asm"

inherit rpm
