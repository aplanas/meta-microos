SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libgmxapi_mpi0-2023-1.1.aarch64.rpm"
RPM_HASH = "ab5ced13e1ef5afc620ad728708e2c717523a459b920e27e58051cbdb365daa2996d6a4b38608a4566d01ed8acd156f4f165e87b0fe6c1077958ae04d87999a9"

RPROVIDES:${PN} += "libgmxapi-mpi.so.0 \
libgmxapi-mpi0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgromacs-mpi.so.8 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
