SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libgromacs8-2023-1.1.aarch64.rpm"
RPM_HASH = "917f383caeda88caae562c1fa4d626f8f821dbed986c849bc7a92149ac9ebbdd8a59dda2a4bd25806f267bd628eeb7bef213a2b0da99df06979ab3e59d90a1dd"

RPROVIDES:${PN} += "libgromacs.so.8()(64bit) \
libgromacs8 \
libgromacs8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmuparser.so.2.3.4()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
