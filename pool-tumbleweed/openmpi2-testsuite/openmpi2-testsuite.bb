SUMMARY = "An implementation of MPI/SHMEM"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-testsuite-2.1.6-14.2.noarch.rpm"
RPM_HASH = "c0f01b4d70ac1034444465d76ecc6a041fa539fdb1c2f2b9504357a93bf1676df80d79fa47e0e77a5ee81ff5eb8ba92b625cbfbe50c1cdaf6779454f06f6fa54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi2-testsuite"
RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openmpi2-libs \
openssh"

inherit rpm
