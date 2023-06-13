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

RPM_NAME = "mumps-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "d05dca5854acf4246fd5f7daf12bfbb1afae9e2ada785de9607aec022b9c6246bb96f9d53b6fd0ddd7cd717ed4531afccf7b910b27b86dbf1b3bd39460e13e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-doc"

RDEPENDS:${PN} += ""

inherit rpm
