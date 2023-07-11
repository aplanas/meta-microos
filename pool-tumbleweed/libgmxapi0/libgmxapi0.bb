SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libgmxapi0-2023-1.2.aarch64.rpm"
RPM_HASH = "cd33a8bf87c830a1b76f44c73cb292906dcb16682e4bba773ae60aae1534bcc0cc9b58947d0b25c63ffa1117042732cd4581866dde15ed649078bc2fb4591624"

RPROVIDES:${PN} += "libgmxapi.so.0 \
libgmxapi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgromacs.so.8 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
