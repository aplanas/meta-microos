SUMMARY = "Capability to package the artifact in an uber-jar"
DESCRIPTION = "This plugin provides the capability to package the artifact in an \
uber-jar, including its dependencies and to shade, i.e. rename, the \
packages of some of the dependencies."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "maven-shade-plugin-3.4.1-1.2.noarch.rpm"
RPM_HASH = "abf2dca970116e93f3ba5f78dbab52b12498214edb4be65a708f411008258b19596a6057e45d2db4f2daaff5154a9272ea7d375229c846a1b2947c577dfafb53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shade-plugin \
mvn-org.apache.maven.plugins-maven-shade-plugin \
mvn-org.apache.maven.plugins-maven-shade-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-collections4 \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-dependency-tree \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.jdom-jdom2 \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-commons \
mvn-org.slf4j-slf4j-api \
mvn-org.vafer-jdependency"

inherit rpm
