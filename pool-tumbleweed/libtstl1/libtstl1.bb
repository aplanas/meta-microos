SUMMARY = "Server library for twin"
DESCRIPTION = "Server library for twin"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "0.9.0+17"

RPM_NAME = "libtstl1-0.9.0+17-3.5.aarch64.rpm"
RPM_HASH = "4715ddb45e12172198f393dfbd1c38a79cab20124a5a125202382764a327b325b70da6f958839498b80030fc2d463448c737828cdd2b63762f9ef64627bd39de"

RPROVIDES:${PN} += "libtstl.so.1()(64bit) \
libtstl1 \
libtstl1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
