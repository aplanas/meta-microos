SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-mvapich2-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "34dd6a7f5e4675a112a64288fbaa3e69bd77fbb577762c98b0d73b4ed7b663e7179008ab3e1ccca1e94b215bff29b0ba79796b4ce5bc7444d3ebd0bfedb8cacb"

RPROVIDES:${PN} += "mumps-mvapich2-devel-static \
mumps-mvapich2-devel-static(aarch-64)"

RDEPENDS:${PN} += "mumps-mvapich2-devel"

inherit rpm
