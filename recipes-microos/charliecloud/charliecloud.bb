SUMMARY = "User-defined software stacks (UDSS) for HPC centers"
DESCRIPTION = "Charliecloud provides user-defined software stacks (UDSS) \
for high-performance computing (HPC) centers. This 'bring your own \
software stack' functionality addresses needs such as: software \
dependencies that are numerous, complex, unusual, differently configured, \
or simply newer/older than what the center provides; build-time \
requirements unavailable within the center, such as relatively \
unfettered internet access; validated software stacks and configuration \
to meet the standards of a particular field of inquiry; portability of \
environments between resources, including workstations and other test \
and development system not managed by the center; consistent \
environments, even archivally so, that can be easily, reliabily, and \
verifiably reproduced in the future; and/or usability and \
comprehensibility."
LICENSE = "Apache-2.0"

PV = "0.23"

RPM_NAME = "charliecloud-0.23-1.8.aarch64.rpm"
RPM_HASH = "69d9f26eec3c7fd29094e0b61fbd035733b6a21a3e0d85421617cc8326976e72d2bd00c4e0773afc6ed8c90d12a06a2ab008afe64ec6deee02087182c44cab94"

RPROVIDES:${PN} += "charliecloud charliecloud(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 fakeroot ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
