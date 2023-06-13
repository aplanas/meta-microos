SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps_5_3_5-gnu-openmpi4-hpc-5.3.5-3.2.aarch64.rpm"
RPM_HASH = "51ffd09f2e9eb52275c654c4a4141c28c55ddf2d686d9fd57595e44d1fd3aa58ce2133ede433a132cc8f0f90d90e135b76a42bcafd1da03ce2b3ee8414922ccb"

RPROVIDES:${PN} += "libmumps_5_3_5-gnu-openmpi4-hpc \
libmumps_5_3_5-gnu-openmpi4-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libopenmpi4-gnu-hpc \
lua-lmod"

inherit rpm
