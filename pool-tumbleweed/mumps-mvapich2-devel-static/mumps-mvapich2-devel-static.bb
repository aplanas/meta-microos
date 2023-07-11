SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-mvapich2-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "2d098d0aeb30e7d2b4aa00263e44491ef4273f77f016c561c9c87b27371f89291b41b86bacbc8431a3ee5159fae4d70b52d511fae3b74c1d803ba1d79b85aef1"

RPROVIDES:${PN} += "mumps-mvapich2-devel-static"

RDEPENDS:${PN} += "mumps-mvapich2-devel"

inherit rpm
