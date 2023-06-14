SUMMARY = "Headers and generators for pplite"
DESCRIPTION = "PPLite is a C++ library implementing the abstract domain of convex polyhedra, \
to be used in tools for static analysis and verification. \
The main characteristics of PPLite: \
 \
  * Both closed and NNC rational convex polyhedra are supported. \
  * Exact computations are based on FLINT."
LICENSE = "GPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "pplite-devel-0.7-1.9.aarch64.rpm"
RPM_HASH = "2e49a47f74344516f2c0e97fe3895a1d523a61f3c74a02721d8af86af0b3d51f6d495936c1ad31e6cd39a68f21ffdaee0102a5c51dca9d1bae30b1de1405181c"

RPROVIDES:${PN} += "pplite-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.17 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libpplite.so.1 \
libpplite1 \
libstdc++.so.6"

inherit rpm
