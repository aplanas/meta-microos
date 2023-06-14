SUMMARY = "Library for computations with polyhedra"
DESCRIPTION = "PPLite is a C++ library implementing the abstract domain of convex polyhedra, \
to be used in tools for static analysis and verification."
LICENSE = "GPL-3.0-or-later"

PV = "0.7"

RPM_NAME = "libpplite1-0.7-1.9.aarch64.rpm"
RPM_HASH = "7cee8c20e91e0ad6e893311bb6b2cb9f22ba11cb7122fb045bbe9ca0878f4b85f55a90b5747f000664ed8b20e6cd4cd162d5160d343cc096bb24c65af7af0991"

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
