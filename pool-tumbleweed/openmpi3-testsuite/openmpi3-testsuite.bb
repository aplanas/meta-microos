SUMMARY = "An implementation of MPI/SHMEM"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-testsuite-3.1.6-7.2.noarch.rpm"
RPM_HASH = "d12d145eb725c97d14074b8f361960f40454382869865b04ad622fc872d9d2f39da11cb9fd06293c9bacf187c250c0bbf50941fcf0fb864313c8d4f052fb80fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi3-testsuite"

RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openmpi3-libs \
openssh"

inherit rpm
