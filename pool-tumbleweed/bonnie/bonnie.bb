SUMMARY = "File System Benchmark"
DESCRIPTION = "Bonnie is a popular performance benchmark that targets various aspects \
of Unix file systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "bonnie-1.6-1.14.aarch64.rpm"
RPM_HASH = "c5542f2c94a094392a65f6bfb7051356ebf62998e3350887e2e4cdb5085239668a37c9d2191ea3fa0cb2818e42c55afabff822aabbee3232bb7e3e7a1e86ef86"

RPROVIDES:${PN} += "bonnie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
