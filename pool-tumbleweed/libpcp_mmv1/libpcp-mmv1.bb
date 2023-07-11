SUMMARY = "Performance Co-Pilot run-time MMV library"
DESCRIPTION = "Performance Co-Pilot (PCP) run-time Memory Mapped Values library"
LICENSE = "LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "libpcp_mmv1-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "0845d154aaa610269a96a75da3d1bf27a6082527fa97c8066d7fa847100917de721ee4ecf9562088724b421905807b4ef1b9c0ac91aed3bb6927e29607b8af37"

RPROVIDES:${PN} += "libpcp-mmv.so.1 \
libpcp-mmv1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp.so.3"

inherit rpm
