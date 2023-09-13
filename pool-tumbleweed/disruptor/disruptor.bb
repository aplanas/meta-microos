SUMMARY = "Concurrent Programming Framework"
DESCRIPTION = "A High Performance Inter-Thread Messaging Library."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "disruptor-3.4.4-2.1.noarch.rpm"
RPM_HASH = "0d681940d46e1545f965254613cd9ba2cfb46cd1a69cf359ecb2487a490353f1343474182aff2aadeba3319f9ff7bfc494c1f0b0e64ab38218d39a67af83c607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "disruptor \
mvn-com.lmax-disruptor \
mvn-com.lmax-disruptor-pom- \
osgi-com.lmax.disruptor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
