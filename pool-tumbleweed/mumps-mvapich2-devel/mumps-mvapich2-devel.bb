SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-mvapich2-devel-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "dc40035646ad6d9eeb5b81954a07896d9da5525d59e172680ff1b196df79fdcb7a9c4827d8e35ea49ab48f89f5e57af119f7b27155c1b4ac0f9e7ba2026b718f"

RPROVIDES:${PN} += "mumps-mvapich2-devel"

RDEPENDS:${PN} += "libmumps5-3-5-mvapich2 \
mumps-devel \
mvapich2-devel \
scalapack-mvapich2-devel"

inherit rpm
