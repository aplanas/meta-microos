SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libgmxapi_mpi0-2023-1.2.aarch64.rpm"
RPM_HASH = "f896b3e08edaff402705e089e21c8051df112b7d9665fa6ae4f7484281a0836338a9b76814057622e877512a13d2a456f494dad48466075c02b68711e5439f7f"

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
