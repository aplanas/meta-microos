SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps5_3_5-openmpi4-compat-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "c144e8702037fcc9156901ad3d83aa666ea730944286c97b1a98e864a5de6a443d6c8656659ce80b1c370a512f2f38f7c2faac549ee9db441f9cb4b0b1cb5d87"

RPROVIDES:${PN} += "libmumps5_3_5-openmpi4-compat \
libmumps5_3_5-openmpi4-compat(aarch-64)"
RDEPENDS:${PN} += "libmumps5_3_5"

inherit rpm
