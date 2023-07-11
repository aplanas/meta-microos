SUMMARY = "Verdict library for evaluating the geometric qualities of regions of space"
DESCRIPTION = "Verdict is a library for evaluating the geometric qualities of regions of space."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "libverdict1_4-1.4.1-1.4.aarch64.rpm"
RPM_HASH = "67ec6e78e9cf71dfc8bbe45c73875c757387a2a2c7bf99223dca59dd94f5485afdc40ce4f070ec560dcb2c0a27947020d470c4636c525f01be604e2c71c37000"

RPROVIDES:${PN} += "libverdict.so.1.4 \
libverdict1-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
