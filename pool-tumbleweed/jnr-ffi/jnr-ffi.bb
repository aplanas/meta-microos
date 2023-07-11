SUMMARY = "Java Abstracted Foreign Function Layer"
DESCRIPTION = "JNR-FFI is a Java library for loading native libraries without writing JNI code \
by hand, or using tools such as SWIG."
LICENSE = "Apache-2.0"

PV = "2.2.13"

RPM_NAME = "jnr-ffi-2.2.13-1.2.noarch.rpm"
RPM_HASH = "b91900f053bbaf74200296d9aaaca0940676c59ff6aaddf98b0124ab574b3a0e87920dcc100d15da8195692923f3b0bf60e33543e0116f955f194452a2e40a7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-ffi \
mvn-com.github.jnr-jnr-ffi \
mvn-com.github.jnr-jnr-ffi-pom- \
osgi-com.github.jnr.ffi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.jnr-jffi \
mvn-com.github.jnr-jffi--native- \
mvn-com.github.jnr-jnr-a64asm \
mvn-com.github.jnr-jnr-x86asm \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-analysis \
mvn-org.ow2.asm-asm-commons \
mvn-org.ow2.asm-asm-tree \
mvn-org.ow2.asm-asm-util"

inherit rpm
