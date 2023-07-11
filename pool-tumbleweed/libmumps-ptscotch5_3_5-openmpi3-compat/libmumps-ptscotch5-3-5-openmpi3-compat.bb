SUMMARY = "A MUltifrontal Massively Parallel Sparse direct Solver"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the serial libraries from the MPI library \
directory MUMPS built for openmpi3."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-ptscotch5_3_5-openmpi3-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "f9550994faf1602869aac551f96b0b47ab9e77bf60dee6717b61111fca1a7ffe769cb89be85e46a8326bcff65bf45de7d7f6f22008f308fc179221a678f81d18"

RPROVIDES:${PN} += "libmumps-ptscotch5-3-5-openmpi3-compat"

RDEPENDS:${PN} += "libmumps-scotch5-3-5"

inherit rpm
