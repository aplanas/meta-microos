SUMMARY = "JCTools Channel implementations"
DESCRIPTION = "Channel implementations for the \
Java Concurrency Tools Library."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "jctools-channels-3.3.0-2.10.noarch.rpm"
RPM_HASH = "1206b21792ff5072e41aebcb14a8b7757e6cbd4202822e19265b7d2643c3f213b9a11cc6017ead278ed10a1c425b97477189a392cfd9072039f04d68eafe3126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-channels \
mvn(org.jctools:jctools-channels) \
mvn(org.jctools:jctools-channels:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.jctools:jctools-core) \
mvn(org.ow2.asm:asm-all)"

inherit rpm
