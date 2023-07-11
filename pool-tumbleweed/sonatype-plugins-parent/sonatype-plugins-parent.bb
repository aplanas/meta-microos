SUMMARY = "Sonatype Plugins Parent POM"
DESCRIPTION = "This package provides Sonatype plugins parent POM used by other Sonatype \
packages."
LICENSE = "Apache-2.0"

PV = "8"

RPM_NAME = "sonatype-plugins-parent-8-1.24.noarch.rpm"
RPM_HASH = "4a8a1fa781ecd109edeeae726504448fe6239d61a71c191dd39b882483a2b52121ffdd495f42801ff8b3a71a084565499d773976d5bc4cb6d85183db085c2855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.sonatype.plugins-plugins-parent-pom- \
sonatype-plugins-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.sonatype.forge-forge-parent-pom-"

inherit rpm
