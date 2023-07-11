SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libnblib_gmx0-2023-1.2.aarch64.rpm"
RPM_HASH = "844ba0eb738fc1b327b518d9343a44677ad38b8ad2bf126be4a2bda3ef55e8b9c83bbf441ba4f78a1b08261ac96a20abeb09639564b3fc76b923b56cec3bb171"

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
