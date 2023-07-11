SUMMARY = "Jackson modules: Base"
DESCRIPTION = "Jackson 'base' modules: modules that build directly on databind, \
and are not data-type, data format, or JAX-RS provider modules."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-modules-base-2.13.3-1.8.noarch.rpm"
RPM_HASH = "50f1a333accadb9e67a55ee8cdfa59775e7a889810fb0c081866424ac28e7419938aa9e839b11be5acaa948aab70a2e041214e21ee2d4dd6d1e746fed706f0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-base \
mvn-com.fasterxml.jackson.module-jackson-modules-base-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom-"

inherit rpm
