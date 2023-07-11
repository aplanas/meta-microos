SUMMARY = "Files needed for developing mumps based applications"
DESCRIPTION = "MUMPS implements a direct solver for large sparse linear systems, with a \
particular focus on symmetric positive definite matrices.  It can \
operate on distributed matrices e.g. over a cluster.  It has Fortran and \
C interfaces, and can interface with ordering tools such as Scotch. \
 \
This package provides links to the static serial libraries from the MPI \
library directory MUMPS built for mvapich2."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-mvapich2-devel-static-compat-5.3.5-3.4.aarch64.rpm"
RPM_HASH = "eda28e6cc772f579331ba91be57ef8d53e92c8ad89c98323600bd7289cac9bc627c3fa1b5b5c8a3c76aab6d01a830f04cd8c26e471489d110556ecc0ce794136"

RPROVIDES:${PN} += "mumps-mvapich2-devel-static-compat"

RDEPENDS:${PN} += "mumps-devel-static"

inherit rpm
