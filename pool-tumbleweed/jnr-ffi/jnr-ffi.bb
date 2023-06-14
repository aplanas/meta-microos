SUMMARY = "Java Abstracted Foreign Function Layer"
DESCRIPTION = "JNR-FFI is a Java library for loading native libraries without writing JNI code \
by hand, or using tools such as SWIG."
LICENSE = "Apache-2.0"

PV = "2.2.13"

RPM_NAME = "jnr-ffi-2.2.13-1.1.noarch.rpm"
RPM_HASH = "c48f027d1439416020c9beb0a3d54fac87a0cb30a0ee00cc5020b8ee3c1216f9c63b4f500cafb995aece7053dce3d5c3d3a167b1000d5594a885aa00c798b253"
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
