SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps_5_3_5-gnu-openmpi2-hpc. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi2-hpc-doc-5.3.5-3.3.noarch.rpm"
RPM_HASH = "1fd298406dfdd95ec7cdea45b4293c41e4113eaef65a576d7232b5bd3b54870df5c42bf95aaaf72185e37504a752a66ff50807ad87613014b37776346361d438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi2-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
