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

RPM_NAME = "libmumps-scotch5_3_5-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "7866ace388f9c11ddee2a141da0d22e3aad45200befd156d7dc0a08e3f6007256090cb8a7036a679a9793824f42ce398f17d54d8806b2774250843d41b0b868d"

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
