SUMMARY = "Maven XML Plugin"
DESCRIPTION = "A plugin for various XML related tasks like validation and transformation."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "xml-maven-plugin-1.0.2-2.10.noarch.rpm"
RPM_HASH = "50590ed7aa219110f445c7b9f1c481ac5916104b62527e64aed2f4b238dd4e35454904c55e16e4a63b8a81f0f3c4aee169c45db15c80856229a179ff752fe3ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.mojo:xml-maven-plugin) \
mvn(org.codehaus.mojo:xml-maven-plugin:pom:) \
xml-maven-plugin"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.codehaus.plexus:plexus-io) \
mvn(org.codehaus.plexus:plexus-resources) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(xml-resolver:xml-resolver)"

inherit rpm
