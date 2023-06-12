SUMMARY = "Native I/O access for java"
DESCRIPTION = "Java Native Runtime Enhanced X-platform I/O"
LICENSE = "Apache-2.0 & LGPL-3.0-only"

PV = "0.32.14"

RPM_NAME = "jnr-enxio-0.32.14-1.1.noarch.rpm"
RPM_HASH = "1f35a0679bb0abe22f1f66a206f8300ed7f4f4d2e76a2176d4cf61c1a06ff74c0cebd52414a941405968505f7eaa08a536b9c9d2f5f4be368aac2c2c37f56237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-enxio \
mvn(com.github.jnr:jnr-enxio) \
mvn(com.github.jnr:jnr-enxio:pom:) \
osgi(com.github.jnr.enxio)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.github.jnr:jnr-constants) \
mvn(com.github.jnr:jnr-ffi)"

inherit rpm
