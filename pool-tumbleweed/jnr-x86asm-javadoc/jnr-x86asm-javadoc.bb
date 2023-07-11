SUMMARY = "Javadoc for jnr-x86asm"
DESCRIPTION = "Javadoc for jnr-x86asm."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "jnr-x86asm-javadoc-1.0.2-2.14.noarch.rpm"
RPM_HASH = "faf4a6a1dba4c92cc31f3fac634355e2c71703f498b507c997ce7310248715ef9971b857ef20a2adf29b11a80bd2a5b795547e5088b7386314a47a345eccc7e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-x86asm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
