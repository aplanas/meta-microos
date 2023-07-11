SUMMARY = "Maven Plugin Tool for Annotations"
DESCRIPTION = "This package provides Java 5 annotation tools for use with Apache Maven."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-annotations-3.6.0-5.2.noarch.rpm"
RPM_HASH = "c3baf49067554f4830b4625b1ea8fecb55508dae8f696de5226f2677a3bf8a49255b713f3a2f5cd88c64412b78232035c91ceb41c707dd00617d207c792d799c"
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
