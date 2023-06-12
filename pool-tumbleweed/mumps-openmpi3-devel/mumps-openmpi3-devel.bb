SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Headers and development files for mumps-openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-openmpi3-devel-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "c77d48c9b2051fe08275d33ca7366b7c238ad6c688460bab67f1f0c6b562c970ad6c11e971d33322748d0205072cbf51252dbda9bb9da3be8c4f1cc74553c758"

RPROVIDES:${PN} += "mumps-openmpi3-devel \
mumps-openmpi3-devel(aarch-64)"
RDEPENDS:${PN} += "libmumps5_3_5-openmpi3 \
mumps-devel \
openmpi3-devel \
scalapack-openmpi3-devel"

inherit rpm
