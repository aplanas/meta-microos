SUMMARY = "CDDB Access Library"
DESCRIPTION = "Libcddb is a library that implements the different protocols (CDDBP, \
HTTP, and SMTP) to access data on a CDDB server (http://freedb.org). It \
tries to be as cross-platform as possible."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.2"

RPM_NAME = "libcddb2-1.3.2-27.1.aarch64.rpm"
RPM_HASH = "d3878f78d1b06ad7a1a2f4331dcc46d218991399482c709c6f3977df26843ce52564c4534bd128a253af3884996b4b7814a013dd5a8af1524941df0ba7bccd2f"

RPROVIDES:${PN} += "libcddb \
libcddb.so.2()(64bit) \
libcddb2 \
libcddb2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
