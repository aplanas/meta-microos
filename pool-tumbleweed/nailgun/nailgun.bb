SUMMARY = "Framework for running Java from the cli without the JVM startup overhead"
DESCRIPTION = "Nailgun is a client, protocol, and server for running Java programs from the \
command line without incurring the JVM startup overhead. Programs run in the \
server (which is implemented in Java), and are triggered by the client \
(written in C), which handles all I/O."
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "nailgun-0.9.1-3.11.noarch.rpm"
RPM_HASH = "dcd2049f8a0b026964d295358b63b8a2a0d512ade8c6910eafe0d762de900efafd2cdda93a17b5ed80deb1c829aa6f9c8ef6350be581a3fe62ef8c910a0285bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.martiansoftware-nailgun-all-pom- \
mvn-com.martiansoftware-nailgun-examples \
mvn-com.martiansoftware-nailgun-examples-pom- \
mvn-com.martiansoftware-nailgun-server \
mvn-com.martiansoftware-nailgun-server-pom- \
nailgun"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
