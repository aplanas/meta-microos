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

RPM_NAME = "charliecloud-0.23-1.9.aarch64.rpm"
RPM_HASH = "4db3447f2f512faad4b6170535f8ad68e431e79ce55ed5545b958dfd23011e5faa4a539058295e4bfbb60a4d3547a5a8562270ee3f240df0f90a7d3095a821cb"

RPROVIDES:${PN} += "charliecloud"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
fakeroot \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
