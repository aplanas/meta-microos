SUMMARY = "Maven Plugin Tool for Ant"
DESCRIPTION = "Descriptor extractor for plugins written in Ant."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-ant-3.6.0-5.1.noarch.rpm"
RPM_HASH = "971832d9aa6dc245f3b170bd33123180c44dc25d234c9953ea3da7a58a5fbc79f2eb484c9a84d1aaa523b7f7344499342074203d7b6126ebc09cb4b37eb32086"
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
