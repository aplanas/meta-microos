SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps. \
 \
 \
 \
 \
This package contains the parallel library with %{mpi_family} and ."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-doc-5.3.5-3.4.noarch.rpm"
RPM_HASH = "859c6985e8b2e391bf426e94687bf3eb7d9d1dd152107469cfa8b1b5721694104d890e695ac55a83a47cbb1c1d7712672591f74b8fea6df84ded4724b007dff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-doc"

RDEPENDS:${PN} += ""

inherit rpm
