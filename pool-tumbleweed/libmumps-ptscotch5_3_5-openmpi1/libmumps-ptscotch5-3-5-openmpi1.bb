SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
This package contains the sequential library with Scotch support enabled."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi1-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "9157b619ef484cb709a8a424f10118375e4c932fed776f6342a9391f00e11fb557b33a9e541cb9f7e68f0f878b9306c037e302fd91b0d23e9eddee9eb704b443"

RPROVIDES:${PN} += "libcmumps-ptscotch.so.5.3.5 \
libdmumps-ptscotch.so.5.3.5 \
libmumps-common.so.5.3.5 \
libmumps-ptscotch5-3-5-openmpi1 \
libpord-ptscotch.so.5.3.5 \
libsmumps-ptscotch.so.5.3.5 \
libzmumps-ptscotch.so.5.3.5"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libblacs.so.2.1.0 \
libblacs2-openmpi1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.12 \
libmpi-usempi-ignore-tkr.so.6 \
libmpi-usempif08.so.11 \
libmpi.so.12 \
libptscotch.so.0 \
libscalapack.so.2.1.0"

inherit rpm
