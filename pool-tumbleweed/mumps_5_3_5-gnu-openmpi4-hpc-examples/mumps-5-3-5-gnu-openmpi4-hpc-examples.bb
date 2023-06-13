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

RPM_NAME = "mumps_5_3_5-gnu-openmpi4-hpc-examples-5.3.5-3.2.aarch64.rpm"
RPM_HASH = "a625458aa6271fd7f9247bb31437072420e0e7eea4fadde0d4eab96a387676c72f00d5aeba00d8913bce599553624a493bbf5916fea7257f0a50155c76c48583"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi4-hpc-examples \
mumps_5_3_5-gnu-openmpi4-hpc-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libmumps_5_3_5-gnu-openmpi4-hpc"

inherit rpm
