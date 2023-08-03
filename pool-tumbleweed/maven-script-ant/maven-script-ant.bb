SUMMARY = "Maven Ant Mojo Support"
DESCRIPTION = "This package provides Maven Ant Mojo Support, which write Maven plugins with \
Ant scripts."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-script-ant-3.6.0-6.1.noarch.rpm"
RPM_HASH = "9b2d3a779f7c0de642420809e43f6c3be7c43adc8c51a0548240d19dc6c9ac81e6dd20f3f3da14e0d72653b6d7840ccd44ad57f51ab93bf01a2dcf0cdad165ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-script-ant \
mvn-org.apache.maven.plugin-tools-maven-script-ant \
mvn-org.apache.maven.plugin-tools-maven-script-ant-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.ant-ant-launcher \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-ant-factory \
mvn-org.codehaus.plexus-plexus-archiver"

inherit rpm
