SUMMARY = "An implementation of MPI/SHMEM (Version 4)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi4-testsuite-4.1.5-2.1.noarch.rpm"
RPM_HASH = "ffde875370fad302fbdb439858eca4f13a1f4491aeeff0c6726d415b1f2ff6ee6fb4ecdf7203bb3ea4e87063ffc3bef4dbcf453ca3daf421af9a4979a92f1e02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi4-testsuite"

RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openmpi4-libs \
openssh"

inherit rpm
