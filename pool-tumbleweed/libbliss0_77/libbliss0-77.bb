SUMMARY = "Library for computing automorphism groups and canonical forms of graphs"
DESCRIPTION = "bliss is a tool for computing automorphism groups and canonical forms \
of graphs."
LICENSE = "LGPL-3.0-only"

PV = "0.77"

RPM_NAME = "libbliss0_77-0.77-1.9.aarch64.rpm"
RPM_HASH = "5deb8c863e47eb08898df4d8d1ce7f490c54609964d4e66a9773e70576326c614e8a937e379ae1c8bfdc78df8e764895e543653787f7296f4346b2a1c1b35775"

RPROVIDES:${PN} += "libbliss.so.0.77 \
libbliss0-77"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm
