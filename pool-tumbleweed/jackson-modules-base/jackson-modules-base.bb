SUMMARY = "Jackson modules: Base"
DESCRIPTION = "Jackson 'base' modules: modules that build directly on databind, \
and are not data-type, data format, or JAX-RS provider modules."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-modules-base-2.15.2-2.1.noarch.rpm"
RPM_HASH = "1f77e14090d4fd30854382115f027c9e17fcca6c0b0c37fa4ba4377f6c533456adb0f5d6bf3e43a852caf7a20a0f74fadfa03366946c2e338bd06d053c93027e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-base \
mvn-com.fasterxml.jackson.module-jackson-modules-base-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom-"

inherit rpm
