SUMMARY = "C++ API for Normaliz, a tool for computation of rotational cones"
DESCRIPTION = "Normaliz is a tool for computations in affine monoids, vector configurations, \
lattice polytopes, and rational cones. \
 \
Normaliz offers an API, libnormaliz, that allows the user to access \
the Normaliz computations from C++ programs."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.4"

RPM_NAME = "libnormaliz3-3.9.4-1.4.aarch64.rpm"
RPM_HASH = "dd3b62e94eff35d9ca675213787ce6d0e24f1f8e0295c4a781bb109eee0465edbbca5bc762dba3e1eaa8c2eb5b23f68ac126eeb283bc1117536e1b238700bf0f"

RPROVIDES:${PN} += "libnormaliz.so.3()(64bit) \
libnormaliz3 \
libnormaliz3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libeanticxx.so.1()(64bit) \
libflint.so.17()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
