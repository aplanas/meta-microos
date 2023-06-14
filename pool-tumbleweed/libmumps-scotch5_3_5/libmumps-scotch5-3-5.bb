SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
 \
 \
This package contains the parallel library with %{mpi_family} and  with Scotch support enabled."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-scotch5_3_5-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "0ed79e00ecbae1702ac2be6eea76e359ca48cd9dda49f65ae816d4b635c13821a7f2d3d28688542ddd2b036a9b5d34800f096986bd2763483abd61b6560af6ce"

RPROVIDES:${PN} += "libcmumps-scotch.so.5.3.5 \
libdmumps-scotch.so.5.3.5 \
libmpiseq-scotch.so.5.3.5 \
libmumps-common.so.5.3.5 \
libmumps-scotch5-3-5 \
libpord-scotch.so.5.3.5 \
libsmumps-scotch.so.5.3.5 \
libzmumps-scotch.so.5.3.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libscotch.so.0"

inherit rpm
