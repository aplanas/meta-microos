SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libgmxapi0-2023-1.1.aarch64.rpm"
RPM_HASH = "6d37c2705b92984fbfa6b3062c572fcbf0df7e8c27c58829f206c04738f3e1aaba37bad31ac73ff0aa496984b2d88e03d4d22f4da5fcbc4812be4b1ed0409912"

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
