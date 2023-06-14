SUMMARY = "Code Generation Library"
DESCRIPTION = "cglib is a powerful, high performance and quality Code Generation \
Library, It is used to extend JAVA classes and implements interfaces at \
runtime."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "cglib-3.3.0-4.4.noarch.rpm"
RPM_HASH = "28378b0bd8a7ca093508774e59bb92022eea99f1d5940ee30c3a9e225636943f8cdbdac632424cfc198e2c24a7a1bd0a09d033ebc940262ccd48e3d67e4985f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cglib \
cglib-nohook \
mvn-cglib-cglib \
mvn-cglib-cglib-full \
mvn-cglib-cglib-full-pom- \
mvn-cglib-cglib-nodep \
mvn-cglib-cglib-nodep-pom- \
mvn-cglib-cglib-pom- \
mvn-cglib-cglib-sample \
mvn-cglib-cglib-sample-pom- \
mvn-net.sf.cglib-cglib \
mvn-net.sf.cglib-cglib-pom- \
mvn-org.sonatype.sisu.inject-cglib \
mvn-org.sonatype.sisu.inject-cglib-pom- \
osgi-net.sf.cglib.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.ow2.asm-asm"

inherit rpm
