SUMMARY = "An implementation of MPI/SHMEM (Version 5)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi_5_0_0-gnu-hpc-testsuite-5.0.0-3.1.noarch.rpm"
RPM_HASH = "b07ee176b4d07397d85f54cd341aa645a5bd3e1f4e59a28a5c10aa3cbc2411fe6e53b5892277afef224a58c20a23199d833e0465c8c14918ce4320df9817b76b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi-5-0-0-gnu-hpc-testsuite"

RDEPENDS:${PN} += "gnu-compilers-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
