SUMMARY = "An implementation of MPI/SHMEM (Version 5)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi_5_0_0-gnu-hpc-testsuite-5.0.0-4.1.noarch.rpm"
RPM_HASH = "66aa380ad521a3dccc47ffaf52361a3aa37d789ae84c5e9b36f5343b2ec6e025c3637d94f109781da663e3a34520200c60afa2e1f8729e6b8d40a7f0c3578619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi-5-0-0-gnu-hpc-testsuite"

RDEPENDS:${PN} += "gnu-compilers-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
