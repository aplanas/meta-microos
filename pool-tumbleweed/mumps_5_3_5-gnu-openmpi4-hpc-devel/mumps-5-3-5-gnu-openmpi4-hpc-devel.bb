SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi4-hpc-devel-5.3.5-3.2.aarch64.rpm"
RPM_HASH = "e42fdb3455efa21a6cf4e692adf73e37d914c95c08f56ef8cd31c1261be0761ee2ee1ea4d06ba8737a16449949964b09ebd4ac1854c97928d4f9692b9b1f2b82"

RPROVIDES:${PN} += "mumps_5_3_5-gnu-openmpi4-hpc-devel \
mumps_5_3_5-gnu-openmpi4-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libmumps_5_3_5-gnu-openmpi4-hpc \
libscalapack2-gnu-openmpi4-hpc-devel \
openmpi4-gnu-hpc-devel"

inherit rpm
