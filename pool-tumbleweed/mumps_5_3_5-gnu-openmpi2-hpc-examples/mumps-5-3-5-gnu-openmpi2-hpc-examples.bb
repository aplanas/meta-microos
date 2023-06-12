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

RPM_NAME = "mumps_5_3_5-gnu-openmpi2-hpc-examples-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "72abd930294cef2be608abfe15e2a4ea01245352bf04de8476d3c4bf2c76e5dc33ac77153645f6e939e17023a3b52ecadedfa1d299c63c5610f1608c323250f3"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi2-hpc-examples \
mumps_5_3_5-gnu-openmpi2-hpc-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libmumps_5_3_5-gnu-openmpi2-hpc"

inherit rpm
