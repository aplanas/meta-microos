SUMMARY = "Unix sockets for Java"
DESCRIPTION = "Unix sockets for Java."
LICENSE = "Apache-2.0"

PV = "0.38.19"

RPM_NAME = "jnr-unixsocket-0.38.19-1.1.noarch.rpm"
RPM_HASH = "a582898cfa3f260a144a9cf76722c13e38a6a34d5d86be89a250e9896b6c48800d84e3afcd8906aee63bc401a75218c408c5cc850c667c09f8929aa887399a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-unixsocket \
mvn(com.github.jnr:jnr-unixsocket) \
mvn(com.github.jnr:jnr-unixsocket:pom:) \
osgi(com.github.jnr.unixsocket)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.github.jnr:jnr-constants) \
mvn(com.github.jnr:jnr-enxio) \
mvn(com.github.jnr:jnr-ffi) \
mvn(com.github.jnr:jnr-posix)"

inherit rpm
