SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi4-hpc-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "b874ab6e745b6a23d6270127d986cd0c189766a006bacb5972a9e6f2bce9594c1597bc7475bf183fa0b1e3376dff428ea838f93ea2fdb34ae14eac043fcadeb4"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi4-hpc \
libscalapack2-gnu-openmpi4-hpc-devel \
openmpi4-gnu-hpc-devel"

inherit rpm
