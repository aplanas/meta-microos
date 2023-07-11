SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "a7fdd39582e43063e45abb315915c175eb22d12f0cd97f9a3fed844eb30eb52d2deafb825aad892493538aa252cc588f6d60ea6e91e59682871bab842955b203"

RPROVIDES:${PN} += "petsc-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
Modules \
libpetsc3-18 \
metis-devel \
suitesparse-devel"

inherit rpm
