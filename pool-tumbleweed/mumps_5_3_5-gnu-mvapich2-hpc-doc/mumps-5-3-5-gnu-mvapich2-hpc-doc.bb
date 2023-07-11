SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides Documentation for mumps_5_3_5-gnu-mvapich2-hpc. \
 \
 \
This package contains the sequential library."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mvapich2-hpc-doc-5.3.5-3.4.noarch.rpm"
RPM_HASH = "1c7668187d7ee377f5dccf8b244ca436a0d563e928f191390bfbe61542240b4b05e04830f52aa513f66895137b268315a75ffb9beb59bb9352df583450860822"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
