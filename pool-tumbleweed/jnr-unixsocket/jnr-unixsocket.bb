SUMMARY = "Unix sockets for Java"
DESCRIPTION = "Unix sockets for Java."
LICENSE = "Apache-2.0"

PV = "0.38.19"

RPM_NAME = "jnr-unixsocket-0.38.19-1.2.noarch.rpm"
RPM_HASH = "b2794764d5d374208517d79ec67a48a26978a63543487a5ad2a4ecdce3773b9e6fd0f14344d753dfa4dae31b1d84555abf3f8e029adf1efe221cf198dd67cd03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-unixsocket \
mvn-com.github.jnr-jnr-unixsocket \
mvn-com.github.jnr-jnr-unixsocket-pom- \
osgi-com.github.jnr.unixsocket"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-enxio \
mvn-com.github.jnr-jnr-ffi \
mvn-com.github.jnr-jnr-posix"

inherit rpm
