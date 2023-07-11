SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-openmpi4."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi4-devel-static-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "e88b9d4bbc16a7d30cd81de8f25ecc0389525ef5517295333c196d62925779a7f89cb090d313ae748a5f28f2a1282001fce7cf2f73521f7902a85d64fcd7b81d"

RPROVIDES:${PN} += "mumps-openmpi4-devel-static"

RDEPENDS:${PN} += "mumps-openmpi4-devel"

inherit rpm
