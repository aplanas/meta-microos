SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps_5_3_5-gnu-openmpi3-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi3-hpc-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "4a2a40e940c0744f66ad59e7ebf1f3d74aacf5db262f12e981948efeec1f9e708f39a21659f73f19c257642c6e0e94a3a62ce73840786d159dd35e78dcd7d2ef"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libmumps-5-3-5-gnu-openmpi3-hpc \
libscalapack2-gnu-openmpi3-hpc-devel \
openmpi3-gnu-hpc-devel"

inherit rpm
