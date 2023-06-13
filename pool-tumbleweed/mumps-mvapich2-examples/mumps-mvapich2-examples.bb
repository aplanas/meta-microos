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

RPROVIDES:${PN} += "mumps(examples)(mvapich2) \
mumps-mvapich2-examples \
mumps-mvapich2-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblacs.so.2.1.0()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libcmumps.so.5.3.5()(64bit) \
libdmumps.so.5.3.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libmpi.so.12()(64bit) \
libmpifort.so.12()(64bit) \
libmumps5_3_5-mvapich2 \
libmumps_common$.so.5.3.5()(64bit) \
libpord.so.5.3.5()(64bit) \
libscalapack.so.2.1.0()(64bit) \
libsmumps.so.5.3.5()(64bit) \
libzmumps.so.5.3.5()(64bit)"

inherit rpm
