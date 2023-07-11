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

RPM_NAME = "mumps_5_3_5-gnu-mpich-hpc-examples-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "669deb36bd678c258e0a8b11e7356a4cc545d5ee2c2fcc05f73b1c69248e84e0a90edd63905b2b39a0ce36baf836059724a6e57e36042798d01f167a503064cd"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mpich-hpc-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-mpich-hpc"

inherit rpm
