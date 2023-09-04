SUMMARY = "An implementation of MPI/SHMEM (Version 5)"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-testsuite-5.0.0-4.1.noarch.rpm"
RPM_HASH = "297c03c25f69a72eae19c15037e68c49abbd895530d369e66a91e52cdb5fdf2ba181c78c7279f37cc09cda0c3d21fb77625a1d0ec1abecd4628360c2fce6267a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpi \
openmpi5-testsuite"

RDEPENDS:${PN} += "mpi-selector \
openmpi-runtime-config \
openmpi5-libs \
openssh"

inherit rpm
