SUMMARY = "Osmocom core library"
DESCRIPTION = "libosmocore is a library with various utility functions shared \
between OpenBSC and OsmocomBB."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocore20-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "9154f33a93cfdcf922691a913fba0692c87673454cd623fe35d856da1ba5891a7850703d84806a2d4a7e1e15001ec69e6b1b80965f970a3a306becac13955ec9"

RPROVIDES:${PN} += "libosmocore.so.20 \
libosmocore20"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libsctp.so.1 \
libtalloc.so.2"

inherit rpm
