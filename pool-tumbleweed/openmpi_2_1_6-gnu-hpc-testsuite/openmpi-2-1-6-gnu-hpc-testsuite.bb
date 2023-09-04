SUMMARY = "An implementation of MPI/SHMEM"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi_2_1_6-gnu-hpc-testsuite-2.1.6-15.1.noarch.rpm"
RPM_HASH = "bb7ff4428a082acd2a66dc89acf06c969c58aebe23d5bf6d4a46dfe1ee62900e9599df3b8d38b061ed9cde1e7b8439ad05115a89995682e2ac98844ee4ed83b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi-2-1-6-gnu-hpc-testsuite"

RDEPENDS:${PN} += "gnu-compilers-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
