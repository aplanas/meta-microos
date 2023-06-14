SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libnblib_gmx0-2023-1.1.aarch64.rpm"
RPM_HASH = "a943ab1479f7453d1c3ac5543099c81815e6d1f1fdcda8aa12419293dabb19dd1150db7b61008e261e24f7aa96fc1321c28499bad027ccd31b3e0343e71ac86d"

RPROVIDES:${PN} += "libnblib-gmx.so.0 \
libnblib-gmx0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libgromacs.so.8 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
