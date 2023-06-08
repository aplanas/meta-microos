SUMMARY = "Concurrent Programming Framework"
DESCRIPTION = "A High Performance Inter-Thread Messaging Library."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "disruptor-3.4.4-1.12.noarch.rpm"
RPM_HASH = "d4abb766ddab1784a1141585dd1674d55a54c88a30a56ef3effa710d8ac717d45418652191a5501c5fc0b3e992896837ff3f76467e4090e99b8f23ba91e7ff22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "disruptor mvn(com.lmax:disruptor) mvn(com.lmax:disruptor:pom:) osgi(com.lmax.disruptor)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem"

inherit rpm
