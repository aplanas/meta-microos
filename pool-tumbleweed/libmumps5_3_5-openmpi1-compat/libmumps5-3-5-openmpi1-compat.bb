SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-openmpi1-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "ff988c49d3daa37226ae55fdec5533bc1a54e81947d0ee263987903033babc9d6ed18527322ad1ab5bd9df68e1dd079fa067f1598fc4ee79ebb382b0750e4f08"

RPROVIDES:${PN} += "libmumps5-3-5-openmpi1-compat"

RDEPENDS:${PN} += "libmumps5-3-5"

inherit rpm
