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

RPM_NAME = "mumps-mvapich2-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "379fb8589670714065ce2c659c7c6366b0542e5f18eb9f085c06e319f072e10aeb1185ffcf3f9a681c4c92498819183c16c01200ed8fc9007938f19adc5d30cb"

RPROVIDES:${PN} += "mumps-examples)(mvapich2 \
mumps-mvapich2-examples"

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
libmpi.so.12 \
libmpifort.so.12 \
libmumps-common$.so.5.3.5 \
libmumps5-3-5-mvapich2 \
libpord.so.5.3.5 \
libscalapack.so.2.1.0 \
libsmumps.so.5.3.5 \
libzmumps.so.5.3.5"

inherit rpm
