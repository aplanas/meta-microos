SUMMARY = "The Portable UPnP SDK's XML library"
DESCRIPTION = "A C XML parsing library originally created for the Intel UPnP SDK for Linux."
LICENSE = "BSD-3-Clause"

PV = "1.14.17"

RPM_NAME = "libixml11-1.14.17-1.1.aarch64.rpm"
RPM_HASH = "f2ac87b5f04eede9dc0a4391e972abf852817d50e2b2aff8a878e3d4723758240eb3ef8c26033598918e7f0bc96637ec6f16e8447f14818c26ecc6e85c2d0637"

RPROVIDES:${PN} += "libixml.so.11()(64bit) \
libixml11 \
libixml11(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
