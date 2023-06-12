SUMMARY = "Simplified DocBook module for maven-doxia"
DESCRIPTION = "This package provides Simplified DocBook module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-docbook-simple-1.9.1-6.7.noarch.rpm"
RPM_HASH = "4de965de50a207868703cae76c56cf0e48bd6be4e09f0cfeec8e309b8700d3b33a18db01ca49310d84d32b3787daa9d74f705fcccd8c74299f41ddb7fa43711e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-docbook-simple \
mvn(org.apache.maven.doxia:doxia-module-docbook-simple) \
mvn(org.apache.maven.doxia:doxia-module-docbook-simple:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.doxia:doxia-core) \
mvn(org.apache.maven.doxia:doxia-sink-api) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
