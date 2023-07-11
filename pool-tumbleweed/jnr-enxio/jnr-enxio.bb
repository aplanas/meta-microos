SUMMARY = "Native I/O access for java"
DESCRIPTION = "Java Native Runtime Enhanced X-platform I/O"
LICENSE = "Apache-2.0 & LGPL-3.0-only"

PV = "0.32.14"

RPM_NAME = "jnr-enxio-0.32.14-1.2.noarch.rpm"
RPM_HASH = "784f00fa2c3302cf842c1a5ec3d4cc21abd170943cb9135a1ca29bc2f5871e996563a962874ca56e391f02808771b35aae2fe3f87854d8aa086b73bfc991a7e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-enxio \
mvn-com.github.jnr-jnr-enxio \
mvn-com.github.jnr-jnr-enxio-pom- \
osgi-com.github.jnr.enxio"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-ffi"

inherit rpm
