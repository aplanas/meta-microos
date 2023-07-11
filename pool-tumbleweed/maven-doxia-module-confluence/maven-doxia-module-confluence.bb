SUMMARY = "Confluence module for maven-doxia"
DESCRIPTION = "This package provides Confluence module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-confluence-1.9.1-6.8.noarch.rpm"
RPM_HASH = "f5e43653723785239ee0a72ddcef3f29edf6711c9c0e719e4cda67b94440aac132c713efe5b896711c0107e802e2d49d17ef08a652dc04d67536e5823d1447ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-confluence \
mvn-org.apache.maven.doxia-doxia-module-confluence \
mvn-org.apache.maven.doxia-doxia-module-confluence-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
