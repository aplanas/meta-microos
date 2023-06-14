SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
Static libraries for mumps-ptscotch-openmpi1."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-ptscotch-openmpi1-devel-static-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "51e0f04aa76245c8099f10163965c6946d0a086c22c5a67c41bea36abae6fd6deddc430c2bacce25b8143bd013d99b1eac778e8e36df8ef26c7a12bceb51ab14"

RPROVIDES:${PN} += "mumps-ptscotch-openmpi1-devel-static"

RDEPENDS:${PN} += "mumps-ptscotch-openmpi1-devel"

inherit rpm
