SUMMARY = "Maven XML Plugin"
DESCRIPTION = "A plugin for various XML related tasks like validation and transformation."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "xml-maven-plugin-1.0.2-2.11.noarch.rpm"
RPM_HASH = "11922e374ce4cdf43fc655f81c2edd4e474eab5c980131ad9bee189ea4b3b3a01ad6309d7bb321a796e21fa105230255802dd94aeb54836497813a3c2568d493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.mojo-xml-maven-plugin \
mvn-org.codehaus.mojo-xml-maven-plugin-pom- \
xml-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.codehaus.plexus-plexus-io \
mvn-org.codehaus.plexus-plexus-resources \
mvn-org.codehaus.plexus-plexus-utils \
mvn-xml-resolver-xml-resolver"

inherit rpm
