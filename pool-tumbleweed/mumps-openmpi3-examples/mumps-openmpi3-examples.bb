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

RPM_NAME = "mumps-openmpi3-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "596205de4ca07ca98ecd87c594d214f6aa6e43c84c0058ee7cbe62058169f04c2e2e1994fd5e85cbba644607fb3f8aa30c357b8721b82c7bcbcb4dfc38981d5d"

RPROVIDES:${PN} += "mumps-examples)(openmpi \
mumps-openmpi3-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblacs.so.2.1.0 \
libblas.so.3 \
libc.so.6 \
libcmumps.so.5.3.5 \
libdmumps.so.5.3.5 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmpi-usempi-ignore-tkr.so.40 \
libmpi-usempif08.so.40 \
libmpi.so.40 \
libmumps-common$.so.5.3.5 \
libmumps5-3-5-openmpi3 \
libpord.so.5.3.5 \
libscalapack.so.2.1.0 \
libsmumps.so.5.3.5 \
libzmumps.so.5.3.5"

inherit rpm
