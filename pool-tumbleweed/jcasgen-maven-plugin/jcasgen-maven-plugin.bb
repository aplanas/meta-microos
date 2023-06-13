SUMMARY = "Apache UIMA Maven JCasGen Plugin"
DESCRIPTION = "A Maven Plugin for using JCasGen to generate Java classes from \
XML type system descriptions."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "jcasgen-maven-plugin-2.8.1-3.10.noarch.rpm"
RPM_HASH = "737b1c05aedefff410a4099e2b6f31d984b734fae4267f1f181bc6726239cc692314bbc9bf77c8b49a063a3688ce74ef5fdc08f1253a06de8c9fbb523455dca9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcasgen-maven-plugin \
mvn(org.apache.uima:jcasgen-maven-plugin) \
mvn(org.apache.uima:jcasgen-maven-plugin:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven:maven-core) \
mvn(org.apache.maven:maven-plugin-api) \
mvn(org.apache.uima:uimaj-tools) \
mvn(org.sonatype.plexus:plexus-build-api)"

inherit rpm
