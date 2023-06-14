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

RPM_NAME = "mumps_5_3_5-gnu-openmpi1-hpc-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "f4aaff25c9979bbbb958c3fdf9365fcbd27a6decb9ba0ee13612a58afc6a609eb1ad92e78d8e01574202b6db3fe1369b6004eb325a016f5988dd2c97f429dcca"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi1-hpc-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi1-hpc"

inherit rpm
