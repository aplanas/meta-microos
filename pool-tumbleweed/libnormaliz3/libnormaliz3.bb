SUMMARY = "C++ API for Normaliz, a tool for computation of rotational cones"
DESCRIPTION = "Normaliz is a tool for computations in affine monoids, vector configurations, \
lattice polytopes, and rational cones. \
 \
Normaliz offers an API, libnormaliz, that allows the user to access \
the Normaliz computations from C++ programs."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.4"

RPM_NAME = "libnormaliz3-3.9.4-1.5.aarch64.rpm"
RPM_HASH = "a174fef1eca70ffd14dfe95760f82371cbeeac10088285ba45489fc3b37b77af91b416933fd9675039b906d61b33aa20aab6b501151d40d69bbb001b28ce8c9d"

RPROVIDES:${PN} += "libnormaliz.so.3 \
libnormaliz3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeanticxx.so.1 \
libflint.so.17 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
