SUMMARY = "Maven WAR Plugin"
DESCRIPTION = "Builds a Web Application Archive (WAR) file from the project output and its \
dependencies."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-war-plugin-3.2.2-3.10.noarch.rpm"
RPM_HASH = "86337b4fc0de89198d2495360787466029985b5e624017fadf6bec40d50e470a1c874944d150c86e0261223bb64efb6db48f6cb558f8747a65b71c45a4ef3815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-war-plugin \
mvn(org.apache.maven.plugins:maven-war-plugin) \
mvn(org.apache.maven.plugins:maven-war-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.thoughtworks.xstream:xstream) \
mvn(commons-io:commons-io) \
mvn(org.apache.maven.shared:maven-filtering) \
mvn(org.apache.maven.shared:maven-mapping) \
mvn(org.apache.maven:maven-archiver) \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-archiver) \
mvn(org.codehaus.plexus:plexus-interpolation) \
mvn(org.codehaus.plexus:plexus-utils)"

inherit rpm
