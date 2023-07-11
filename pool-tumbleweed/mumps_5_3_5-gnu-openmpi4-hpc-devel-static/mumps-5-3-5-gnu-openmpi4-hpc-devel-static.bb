SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-openmpi4-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi4-hpc-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "4151e53bad447758ced96ac4f2705e497f0b11e2b1bdc7195ac0d26863bf96b1f1cc1ac61aebbe02644f6cb46d1770940cd55a888c6a311e676167d4362fd8c9"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi4-hpc-devel-static"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-openmpi4-hpc-devel"

inherit rpm
