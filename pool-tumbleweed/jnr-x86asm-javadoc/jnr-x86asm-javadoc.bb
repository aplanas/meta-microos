SUMMARY = "Javadoc for jnr-x86asm"
DESCRIPTION = "Javadoc for jnr-x86asm."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "jnr-x86asm-javadoc-1.0.2-2.13.noarch.rpm"
RPM_HASH = "2c5f0568e36243d1bfbabeb461c48e12a6231366c033f62b42e924202ac095fafa261a69c7b056e365a9abe751dcbe44abed60233f457fc8f99ecc380f948bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-x86asm-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
