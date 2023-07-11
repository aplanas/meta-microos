SUMMARY = "Concurrent Programming Framework"
DESCRIPTION = "A High Performance Inter-Thread Messaging Library."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "disruptor-3.4.4-1.13.noarch.rpm"
RPM_HASH = "967a4579563b6b9c316030907138270117ca7574a73caa10cdc563484247ea81353d5da944d7cedfc416381a31c60c5d9c5a7754b5192f6b24ff6a74b0c4bc19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "disruptor \
mvn-com.lmax-disruptor \
mvn-com.lmax-disruptor-pom- \
osgi-com.lmax.disruptor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
