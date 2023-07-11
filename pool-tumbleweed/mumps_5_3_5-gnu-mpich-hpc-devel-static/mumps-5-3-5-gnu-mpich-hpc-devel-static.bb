SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-mpich-hpc-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "c14811e1933bdcdc492c489ddca1ae762beaa0eaad63695fae209ec745cedda0cf3af4bc487ecef5b2a28b41c4aa4343012dfccba6ca389d54f07e5e49d576fa"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-mpich-hpc-devel-static"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-mpich-hpc-devel"

inherit rpm
