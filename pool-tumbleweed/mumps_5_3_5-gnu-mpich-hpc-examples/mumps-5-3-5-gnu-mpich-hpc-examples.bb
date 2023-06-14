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

RPM_NAME = "mumps_5_3_5-gnu-mpich-hpc-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "6b1f7366dc8c1b04e3a8fb2261e68b7f77d9b8474bcbcdd50015a3e74ebcce9439197aed174959f428814cf6b9589c963ee52bfe0f03a0fdf43b722d3bfd0b16"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mpich-hpc-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-mpich-hpc"

inherit rpm
