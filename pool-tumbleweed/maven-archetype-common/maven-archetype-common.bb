SUMMARY = "Maven Archetype common classes"
DESCRIPTION = "Maven Archetype common classes."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "maven-archetype-common-3.2.1-2.1.noarch.rpm"
RPM_HASH = "4f157cce76474361b2989a36feb5371c88c37b9283df6f18db1c84a954adc5b34caf5aeecce8554187617f5cc8972213fc61666114d49bf940de1965bf805de8"
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
