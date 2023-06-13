SUMMARY = "Verdict library for evaluating the geometric qualities of regions of space"
DESCRIPTION = "Verdict is a library for evaluating the geometric qualities of regions of space."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "libverdict1_4-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "615e7d3911d2033109bd0459b8cfc55bd204c8989146955b8eab38d1284f503acdeebeaf544736bd93c511a1e7700ba76cb8e7427d4bb0c97c4e99a39e0967e4"

RPROVIDES:${PN} += "libverdict.so.1.4()(64bit) \
libverdict1_4 \
libverdict1_4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
