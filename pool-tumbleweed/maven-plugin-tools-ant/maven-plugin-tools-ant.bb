SUMMARY = "Maven Plugin Tool for Ant"
DESCRIPTION = "Descriptor extractor for plugins written in Ant."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-ant-3.6.0-5.2.noarch.rpm"
RPM_HASH = "1a7f29486d74e75532017e9564be0ec917a320674ffbdca98673a513981cda007cfd15c0cc4a2d1d965707f9ab908c10b8dc768291387bc4eb20bb980cba1fcb"
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
