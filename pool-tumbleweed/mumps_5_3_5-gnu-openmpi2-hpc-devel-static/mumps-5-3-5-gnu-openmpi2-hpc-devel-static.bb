SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps_5_3_5-gnu-openmpi2-hpc-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "087329d7edf0c1f542981b2fea7c3675b4fc76cf2d5169d6ac8e6518bb67eb2307f18949e80cb50884a4e7dffe8cde35dbcdc8e7d3bbf8ebc5fd822b6e344e9b"

RPROVIDES:${PN} += "mumps-5-3-5-gnu-openmpi2-hpc-devel-static"

RDEPENDS:${PN} += "mumps-5-3-5-gnu-openmpi2-hpc-devel"

inherit rpm
