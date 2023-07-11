SUMMARY = "Simplified DocBook module for maven-doxia"
DESCRIPTION = "This package provides Simplified DocBook module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-docbook-simple-1.9.1-6.8.noarch.rpm"
RPM_HASH = "324f66f1efffef3bdcb47490c2de2c0c37df3e70a9c851ad9db83fa3a4f7741452b62509fb71d08e4702c22c59d816072f73cdba143223af72edc9b0a288941d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-docbook-simple \
mvn-org.apache.maven.doxia-doxia-module-docbook-simple \
mvn-org.apache.maven.doxia-doxia-module-docbook-simple-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-core \
mvn-org.apache.maven.doxia-doxia-sink-api \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm
