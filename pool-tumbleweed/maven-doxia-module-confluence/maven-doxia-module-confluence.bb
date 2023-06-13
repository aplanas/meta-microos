SUMMARY = "Confluence module for maven-doxia"
DESCRIPTION = "This package provides Confluence module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-module-confluence-1.9.1-6.7.noarch.rpm"
RPM_HASH = "514392682c98ffb32d1ca29456577408b69293b1cbf5708b3cbbe5a7fa6dde0fce64ca59e3ce00e39bd8c945fa072994619f79b9dff07035f2ddd194bc04f210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-module-confluence \
mvn(org.apache.maven.doxia:doxia-module-confluence) \
mvn(org.apache.maven.doxia:doxia-module-confluence:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.doxia:doxia-core) \
mvn(org.apache.maven.doxia:doxia-sink-api) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
