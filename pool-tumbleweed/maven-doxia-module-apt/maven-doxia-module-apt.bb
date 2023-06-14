SUMMARY = "APT module for maven-doxia"
DESCRIPTION = "This package provides APT module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-apt-1.9.1-6.7.noarch.rpm"
RPM_HASH = "2c70faa74d723e856566a8347f66a034b16f7a8e672a05f4f0fc5981289030e98bda4511876c80d91014aac6d3db1d88faebde09d191070edf214bc0bf243e81"
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
