SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "737577ea04b5e20611d438005c492913f220b32c298f3dfb3a6c28ed74c7e11dbcbd3980c1166ba8f1a2cc548e944d380fbde0b2666da40233956b4a63c8e77c"

RPROVIDES:${PN} += "petsc-devel \
petsc-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
/usr/bin/sh \
Modules \
libpetsc3_18 \
metis-devel \
suitesparse-devel"

inherit rpm
