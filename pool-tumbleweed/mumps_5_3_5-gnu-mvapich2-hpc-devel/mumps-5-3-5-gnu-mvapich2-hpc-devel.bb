SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mvapich2-hpc-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "8e3316c56cfe98809df98807b1abc6bd3b170441fe864fce837cb09621715b0b31f5704cb2697a799ac301271856f3d098b0289fc776f3b80e0daf867328d5f8"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-mvapich2-hpc \
libscalapack2-gnu-mvapich2-hpc-devel \
mvapich2-gnu-hpc-devel"

inherit rpm
