SUMMARY = "Headers and generators for pplite"
DESCRIPTION = "PPLite is a C++ library implementing the abstract domain of convex polyhedra, \
to be used in tools for static analysis and verification. \
The main characteristics of PPLite: \
 \
  * Both closed and NNC rational convex polyhedra are supported. \
  * Exact computations are based on FLINT."
LICENSE = "GPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "pplite-devel-0.7-1.10.aarch64.rpm"
RPM_HASH = "73c173e3d2bb98298b381009af1885e17ea3ae1ca67ab45e470442862faf988b9214295d198b951b3a0b69e785f9ccc039cc0b819aefa34244c14778b2e897af"

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
