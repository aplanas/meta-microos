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

RPM_NAME = "mumps_5_3_5-gnu-openmpi2-hpc-examples-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "c368509090a3d5e0ac37fe623b6ecbb44185efa8af59e9ad2cd8ce9a4d159000b185f609a68e30ac14b7944660b8b8669d7467467c1abfa4ae26ac7773f8f88d"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi2-hpc-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi2-hpc"

inherit rpm
