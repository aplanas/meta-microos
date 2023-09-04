SUMMARY = "An implementation of MPI/SHMEM"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-testsuite-3.1.6-8.1.noarch.rpm"
RPM_HASH = "fb549f387ac50dd084d9fe9a3ccf535954f4d842f46102d106fd869d5fb1bca1897cee375c0bf86148c604efbec99a7b6495928d5a88a56601eb12fd637ca33f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi3-testsuite"

RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openmpi3-libs \
openssh"

inherit rpm
