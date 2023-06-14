SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mpich-hpc-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "6c042620712db6434e6de6f1c9790293091278d072bbe93cce26581e491cbc70ecebc0efab7f3bab8efdb35f420a1cd3da8a5b1e4a839c7d39f3d96145b3a7ab"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-mpich-hpc \
libscalapack2-gnu-mpich-hpc-devel \
mpich-gnu-hpc-devel"

inherit rpm
