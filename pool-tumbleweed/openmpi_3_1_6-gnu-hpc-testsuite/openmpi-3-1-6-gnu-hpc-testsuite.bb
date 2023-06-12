SUMMARY = "An implementation of MPI/SHMEM"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi_3_1_6-gnu-hpc-testsuite-3.1.6-7.2.noarch.rpm"
RPM_HASH = "97b86571814a747c716f7aad8b4eb44089cdd357f14d00d5248dbf208f9b818ac189c9dcdeffc8a80a4c124e1ad5eb6f87d38e638df64b3519f6d3bf62a75a86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi_3_1_6-gnu-hpc-testsuite"
RDEPENDS:${PN} += "gnu-compilers-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
