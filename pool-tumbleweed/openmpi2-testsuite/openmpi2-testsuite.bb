SUMMARY = "An implementation of MPI/SHMEM"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-testsuite-2.1.6-15.1.noarch.rpm"
RPM_HASH = "8d2f4ae11dc4f672bf17146b9c50989cb7c932c6749e7e1f1626c95eca8a2f36ca5e95732ccd2fd31f31f081ab1476ec38f73edb1db2cbc6cda0e4c7f0c2140c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi2-testsuite"

RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openmpi2-libs \
openssh"

inherit rpm
