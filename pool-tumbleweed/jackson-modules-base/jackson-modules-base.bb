SUMMARY = "Jackson modules: Base"
DESCRIPTION = "Jackson 'base' modules: modules that build directly on databind, \
and are not data-type, data format, or JAX-RS provider modules."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-modules-base-2.15.2-1.1.noarch.rpm"
RPM_HASH = "4971e4a321b94164fa3108eb6a4af248b70cfa23c8244a7b13a469f2058234dd04714d66a491b9c1d1d9bbaadddcd64a8d871623e2556f8562acd09ba1a6cbbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-modules-base \
mvn-com.fasterxml.jackson.module-jackson-modules-base-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom-"

inherit rpm
