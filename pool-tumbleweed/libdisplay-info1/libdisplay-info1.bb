SUMMARY = "EDID and DisplayID library"
DESCRIPTION = "libdisplay-info is an EDID and DisplayID library. It provides a \
low-level API exposing all of the details of these formats, plus a \
high-level API (of opinionated functions) which abstracts these \
details for common operations."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "libdisplay-info1-0.1.1-1.4.aarch64.rpm"
RPM_HASH = "c66dba277345ce090fd065475fc2cd2fa86ec0dbc4987d50565c0e7ddbfd004a644ad534fb21f769eed8aa442e33afa30d4367085c1af6319483f72c16b494de"

RPROVIDES:${PN} += "libdisplay-info.so.1 \
libdisplay-info1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
