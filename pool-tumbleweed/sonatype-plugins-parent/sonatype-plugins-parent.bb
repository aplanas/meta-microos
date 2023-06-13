SUMMARY = "Sonatype Plugins Parent POM"
DESCRIPTION = "This package provides Sonatype plugins parent POM used by other Sonatype \
packages."
LICENSE = "Apache-2.0"

PV = "8"

RPM_NAME = "sonatype-plugins-parent-8-1.23.noarch.rpm"
RPM_HASH = "a48add1deaffcacfacaaab749db0347d817920dc9d94a76b6a67ccc653cdf52695a6497d20dc330f5133119881790d5ad9fdbc067af135961cd0e6531338488d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.sonatype.plugins:plugins-parent:pom:) \
sonatype-plugins-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.sonatype.forge:forge-parent:pom:)"

inherit rpm
