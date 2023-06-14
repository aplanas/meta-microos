SUMMARY = "A ProcessBuilder look-alike based entirely on native POSIX APIs"
DESCRIPTION = "The jnr-process library provides a drop-in replacement for the JDK \
ProcessBuilder API, but instead of a thread-pumped shim it is a direct \
abstraction around the posix_spawn C API and provides selectable in, out, and \
err channels."
LICENSE = "Apache-2.0"

PV = "0.4.12"

RPM_NAME = "jnr-process-0.4.12-1.1.noarch.rpm"
RPM_HASH = "a1a7dc1038d1a0e54539c86d783d4f20ff3ee20b1a824146b6de49d6bc086412e2dd95a1e95273ff0fac000a431c18ca9bfbdd7202b71590df16edac8c1bcd60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-process \
mvn-com.github.jnr-jnr-process \
mvn-com.github.jnr-jnr-process-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jnr-constants \
mvn-com.github.jnr-jnr-enxio \
mvn-com.github.jnr-jnr-posix"

inherit rpm
