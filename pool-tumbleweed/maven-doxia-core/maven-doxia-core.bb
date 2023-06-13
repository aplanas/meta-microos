SUMMARY = "Core module for maven-doxia"
DESCRIPTION = "This package provides Core module for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-core-1.9.1-6.7.noarch.rpm"
RPM_HASH = "da8b06e9e9dae4846bdfb94a2b7f9c5c8872c7a64326201e31bd2974a1ee2270cf7b2ba7a14ff78b1d84a99aaa3eac2c9a86b9e0cdd0ddda98f7f332b755d5c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-core \
mvn(org.apache.maven.doxia:doxia-core) \
mvn(org.apache.maven.doxia:doxia-core:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.commons:commons-lang3) \
mvn(org.apache.httpcomponents:httpclient) \
mvn(org.apache.httpcomponents:httpcore) \
mvn(org.apache.maven.doxia:doxia-logging-api) \
mvn(org.apache.maven.doxia:doxia-sink-api) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-container-default) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
