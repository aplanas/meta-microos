SUMMARY = "Maven Plugin for using archetypes"
DESCRIPTION = "Maven Plugin for using archetypes."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-plugin-3.2.1-2.1.noarch.rpm"
RPM_HASH = "f2c9221e17fc81e855d29d7de4f3d7a9b0d0d7a2dd96264fd2310a7f825c7c76a754725a8c2cf701b09c816c694474dcf40b11d19e4195aab9a6ed723f2918b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-plugin \
mvn-org.apache.maven.plugins-maven-archetype-plugin \
mvn-org.apache.maven.plugins-maven-archetype-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-collections-commons-collections \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven.archetype-archetype-catalog \
mvn-org.apache.maven.archetype-archetype-common \
mvn-org.apache.maven.archetype-archetype-descriptor \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.apache.maven.shared-maven-script-interpreter \
mvn-org.apache.velocity-velocity \
mvn-org.codehaus.plexus-plexus-archiver \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-interactivity-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-velocity"

inherit rpm
