SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mvapich2-hpc-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "69b9d68a3d80495e2f16d84dbb56fd822217c0710b46f03dad70ae9030c51108242a57fababf41f9cc17697910516fa8ad494524cbbb63fe825297dacc1efbe2"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mvapich2-hpc-devel-static"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-mvapich2-hpc-devel"

inherit rpm
