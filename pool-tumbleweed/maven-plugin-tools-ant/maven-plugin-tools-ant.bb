SUMMARY = "Maven Plugin Tool for Ant"
DESCRIPTION = "Descriptor extractor for plugins written in Ant."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-ant-3.6.0-6.1.noarch.rpm"
RPM_HASH = "610e76cf7ffa523f306b8bb29a35711875b13ffb9ceb6fec3ee7a701fece323f434dec42270dd7b26c2380389c2be766cdce9f8b9fcf3fa40dc3579fe6aeb7c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-ant \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-ant \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-ant-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-tools-model \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
