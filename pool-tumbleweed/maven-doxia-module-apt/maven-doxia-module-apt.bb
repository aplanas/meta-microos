SUMMARY = "APT module for maven-doxia"
DESCRIPTION = "This package provides APT module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-apt-1.9.1-6.8.noarch.rpm"
RPM_HASH = "2401c38c4503b300657af06df751882f72ee439ea8c31adcf5882f4a5e001514d667fd3799ed68f0749e6084877ffc5850fd5fcb087c39534f805208aea9927d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-apt \
mvn-org.apache.maven.doxia-doxia-module-apt \
mvn-org.apache.maven.doxia-doxia-module-apt-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
