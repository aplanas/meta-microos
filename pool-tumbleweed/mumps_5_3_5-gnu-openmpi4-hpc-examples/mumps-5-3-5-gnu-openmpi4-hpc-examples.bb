SUMMARY = "Test programs and examples for mumps"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This packages contains some test and examples programs for mumps. In addition, \
matlab and scilab extensions are provided in /usr/share/doc/packages/mumps."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi4-hpc-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "e8f55009c978b70a0b9aac4976d2d49d4da52c005e9c1cbb2fe268ea8fab8647e18f2792a97b0a7cf306fe751023c36701394384ceeb6f1e306e0378e1b085ca"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi4-hpc-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi4-hpc"

inherit rpm
