SUMMARY = "JCTools Channel implementations"
DESCRIPTION = "Channel implementations for the \
Java Concurrency Tools Library."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-channels-3.3.0-2.11.noarch.rpm"
RPM_HASH = "87cc00aba21b41fb4c03eef8a1891d8f82e42683a565cd3f222423d03bc8e24c8573877a3c39e080bc32a8aca0987e6ca38299b988cacfb93a26de6ff860b9a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-channels \
mvn-org.jctools-jctools-channels \
mvn-org.jctools-jctools-channels-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jctools-jctools-core \
mvn-org.ow2.asm-asm-all"

inherit rpm
