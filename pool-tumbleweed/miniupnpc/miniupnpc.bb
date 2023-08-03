SUMMARY = "Universal Plug'n'Play (UPnP) Client"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "miniupnpc-2.2.5-1.1.aarch64.rpm"
RPM_HASH = "aa750b93b2541b669ea711366c8637eca5fbe496430211a1a7be04c02c03693d1d8dee1149c1890b45092ce2031f981e64983c00f7111350c482eb1b08caa09c"

RPROVIDES:${PN} += "miniupnpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libminiupnpc.so.17 \
libminiupnpc17"

inherit rpm
