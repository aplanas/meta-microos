SUMMARY = "A ProcessBuilder look-alike based entirely on native POSIX APIs"
DESCRIPTION = "The jnr-process library provides a drop-in replacement for the JDK \
ProcessBuilder API, but instead of a thread-pumped shim it is a direct \
abstraction around the posix_spawn C API and provides selectable in, out, and \
err channels."
LICENSE = "Apache-2.0"

PV = "0.4.12"

RPM_NAME = "jnr-process-0.4.12-1.2.noarch.rpm"
RPM_HASH = "adced3ec444c57d99583142d853dcdb5886fa61e2a3d8a2a0dacfc82f6ec57d7bb0f787432caa6ada205e5de6d5482dd763847e28ee96dafa63ee68101c12eb9"
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
