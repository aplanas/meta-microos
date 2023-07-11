SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-openmpi1-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi1-hpc-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "9511737b2b9bb6921138767ff343703a13004356fc25a024daa80731693d57f787f926388890b4b5a90b9230a1fcd12814df2ead8949aa3c321fe7961fb8d229"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi1-hpc \
libscalapack2-gnu-openmpi1-hpc-devel \
openmpi1-gnu-hpc-devel"

inherit rpm
