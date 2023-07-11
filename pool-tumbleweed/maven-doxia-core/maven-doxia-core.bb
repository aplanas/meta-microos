SUMMARY = "Core module for maven-doxia"
DESCRIPTION = "This package provides Core module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-core-1.9.1-6.8.noarch.rpm"
RPM_HASH = "3bf1bf4051a05d23de13d4b234e443a9067ea6ec5f81e5e055d9d7bb0c22ac5e8dede6b1eb72992a0770183b838522859938fc105665e77e4029e2b3afd35834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-core \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-core-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.httpcomponents-httpclient \
mvn-org.apache.httpcomponents-httpcore \
mvn-org.apache.maven.doxia-doxia-logging-api \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-container-default \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
