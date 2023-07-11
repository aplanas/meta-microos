SUMMARY = "Maven Archetype common classes"
DESCRIPTION = "Maven Archetype common classes."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-common-3.2.1-1.10.noarch.rpm"
RPM_HASH = "e0a50f860f67aff96d0e3893c2fc7587c2391dadb7ab3ebc76a12f6fdc030772505320bc1013cf8bcd336bc1ad2a7a047b8a5ad5c110aadf79158a71d83c2a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archetype-common \
mvn-org.apache.maven.archetype-archetype-common \
mvn-org.apache.maven.archetype-archetype-common-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.ibm.icu-icu4j \
mvn-commons-collections-commons-collections \
mvn-commons-io-commons-io \
mvn-org.apache.maven-maven-aether-provider \
mvn-org.apache.maven.archetype-archetype-catalog \
mvn-org.apache.maven.archetype-archetype-descriptor \
mvn-org.apache.maven.shared-maven-artifact-transfer \
mvn-org.apache.maven.shared-maven-invoker \
mvn-org.apache.velocity-velocity \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-velocity \
mvn-org.eclipse.aether-aether-impl \
mvn-org.jdom-jdom2"

inherit rpm
