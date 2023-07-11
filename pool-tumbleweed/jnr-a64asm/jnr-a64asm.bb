SUMMARY = "AArch64 assembler for the Java Native Runtime"
DESCRIPTION = "This is a pure-java port of asmjit for AARCH64 architecture \
(http://code.google.com/p/asmjit/). This is remote assembler for jnr-ffi to \
support aarch64 architecture."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jnr-a64asm-1.0.0-2.2.noarch.rpm"
RPM_HASH = "c1fea0bf84784766c0a12eb825a593b3a1e81c4ae06debb263f52143b76afecaf455fd7568d1151b37639adfc0377ebff1b975648db3a074af2c4648bd10bd7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-a64asm \
mvn-com.github.jnr-jnr-a64asm \
mvn-com.github.jnr-jnr-a64asm-pom- \
osgi-com.github.jnr.a64asm"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
