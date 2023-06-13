SUMMARY = "An implementation of MPI/SHMEM (Version 5)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi_5_0_0-gnu-hpc-testsuite-5.0.0-2.2.noarch.rpm"
RPM_HASH = "23a93112f1369b98f9afcede24a2dbfa8b8b769fda92e64a31e03298274842d76f93c93f9abd9f4d6f94f43158f8af84ea9644de86fa3287cf3b659af12f21c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi_5_0_0-gnu-hpc-testsuite"

RDEPENDS:${PN} += "gnu-compilers-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
