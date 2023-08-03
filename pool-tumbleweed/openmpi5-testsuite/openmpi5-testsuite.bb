SUMMARY = "An implementation of MPI/SHMEM (Version 5)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-testsuite-5.0.0-3.1.noarch.rpm"
RPM_HASH = "ab44ed0afaee5080d5250045d0c698871efb5622ba55b706b256025ebc24fd1366dd9f4bdf0196dbfa728b5e15c425784d491ccfce990c0781d94757d7cb067d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi5-testsuite"

RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openmpi5-libs \
openssh"

inherit rpm
