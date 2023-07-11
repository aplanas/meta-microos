SUMMARY = "C++ interface of the Parma Polyhedra Library"
DESCRIPTION = "Shared library for the Parma Polyhedra Library."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "libppl14-1.2-3.2.aarch64.rpm"
RPM_HASH = "942dd365ae40eef1a04bdc5e60e2543a252e97958b14b186d9eb1b79d52756f5758453529542a065611ee43a64e0e141a568021a5e545c22f7d26afdb57d5c35"

RPROVIDES:${PN} += "libppl.so.14 \
libppl14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
