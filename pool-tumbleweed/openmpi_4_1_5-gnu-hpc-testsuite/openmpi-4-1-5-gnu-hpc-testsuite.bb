SUMMARY = "An implementation of MPI/SHMEM (Version 4)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi_4_1_5-gnu-hpc-testsuite-4.1.5-2.1.noarch.rpm"
RPM_HASH = "cc5830926fdc1808bcac73c6cf4778d416b4c7940c53d4725abf0d54acdfca17014054a3ff959b6057677175863697fcb0e47a0bf283fe26364b0be068d11bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi-4-1-5-gnu-hpc-testsuite"

RDEPENDS:${PN} += "gnu-compilers-hpc \
lua-lmod \
openmpi-runtime-config \
openssh"

inherit rpm
