SUMMARY = "AArch64 assembler for the Java Native Runtime"
DESCRIPTION = "This is a pure-java port of asmjit for AARCH64 architecture \
(http://code.google.com/p/asmjit/). This is remote assembler for jnr-ffi to \
support aarch64 architecture."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "jnr-a64asm-1.0.0-3.1.noarch.rpm"
RPM_HASH = "5377dc3b50f6f0caab3c44780ff10d5dd0de4683f37da30a75cc13971468690e9c53c6bdaf1da2fabc75c405962327124b842eff259397b4f089cfa2288ee239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-a64asm \
mvn-com.github.jnr-jnr-a64asm \
mvn-com.github.jnr-jnr-a64asm-pom- \
osgi-com.github.jnr.a64asm"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
