SUMMARY = "Maven Plugin Tools Generators"
DESCRIPTION = "The Maven Plugin Tools Generators provides content generation \
(documentation, help) from plugin descriptor."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "maven-plugin-tools-generators-3.6.0-5.1.noarch.rpm"
RPM_HASH = "550c2b63f0f5d45ebe8d4ed3e4429dc5a49d1ca2b0f47fe7e2350796ceef142de9419b72d479fc66fe27050d3e4c6616647ac6c42e104b55a2ff5d10e8fa30b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-plugin-tools-generators \
mvn(org.apache.maven.plugin-tools:maven-plugin-tools-generators) \
mvn(org.apache.maven.plugin-tools:maven-plugin-tools-generators:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(net.sf.jtidy:jtidy) \
mvn(org.apache.maven.plugin-tools:maven-plugin-tools-api) \
mvn(org.apache.maven.reporting:maven-reporting-api) \
mvn(org.apache.maven:maven-model) \
mvn(org.apache.velocity:velocity) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.codehaus.plexus:plexus-velocity) \
mvn(org.ow2.asm:asm) \
mvn(org.ow2.asm:asm-commons)"

inherit rpm
