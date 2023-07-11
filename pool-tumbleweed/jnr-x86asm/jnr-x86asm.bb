SUMMARY = "Pure java x86 and x86_64 assembler"
DESCRIPTION = "This is a pure-java port of asmjit (http://code.google.com/p/asmjit/)."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "jnr-x86asm-1.0.2-2.14.noarch.rpm"
RPM_HASH = "2ee091a000ea9b470b25c44892138ccf2b9847cb275d6ebc694f4eb93c9d7151e4a4f27fc867bb0058e7bb400b963bef1811239de063ec189a78615f50f55d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-x86asm \
mvn-com.github.jnr-jnr-x86asm \
mvn-com.github.jnr-jnr-x86asm-pom- \
osgi-jnr.x86asm"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
