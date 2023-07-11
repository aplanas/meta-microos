SUMMARY = "Code Generation Library"
DESCRIPTION = "cglib is a powerful, high performance and quality Code Generation \
Library, It is used to extend JAVA classes and implements interfaces at \
runtime."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "cglib-3.3.0-4.5.noarch.rpm"
RPM_HASH = "a00c575cf08380dd48c3077d18a6b98d81cb20a07bdb0e2981b1a2d872fe0ffdc04c323ec20d76a2514669fc935f9868434b659ff3a9a73624b919becc1e2ccb"
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
