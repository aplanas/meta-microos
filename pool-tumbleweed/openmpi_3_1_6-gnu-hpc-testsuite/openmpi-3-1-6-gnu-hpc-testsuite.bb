SUMMARY = "An implementation of MPI/SHMEM"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi_3_1_6-gnu-hpc-testsuite-3.1.6-8.1.noarch.rpm"
RPM_HASH = "71272770bd21ec15281078e2dc308123b866636320f082084f2cfaae31e0684f2b00bce9269f3e838c9f8632791fefdd2e88a318e8890ab8aec883d589184619"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi-3-1-6-gnu-hpc-testsuite"

RDEPENDS:${PN} += "gnu-compilers-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
