SUMMARY = "Library for computations with polyhedra"
DESCRIPTION = "PPLite is a C++ library implementing the abstract domain of convex polyhedra, \
to be used in tools for static analysis and verification."
LICENSE = "GPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libpplite1-0.7-1.10.aarch64.rpm"
RPM_HASH = "63237d5a755b8d0e0b2bca375ba87a519d2c500cbf996b6ae4bac0b5e13322c9939b4360e68245eae90f2b5c15f51390227b64f6ce3cae598783deaf2ae4b7ae"

RPROVIDES:${PN} += "libpplite.so.1 \
libpplite1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.17 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libstdc++.so.6"

inherit rpm
