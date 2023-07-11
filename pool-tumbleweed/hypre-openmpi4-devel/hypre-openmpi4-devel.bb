SUMMARY = "Headers and library links for libHYPRE2_20_0-openmpi4"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi4 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-openmpi4-devel-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "a8ff2d678e42e5b3ef90eb3bc76c72d4321348bd9db25a180348e243a378e64928533a8370dcc37c7408b1cba841f705b499d3b50f8c1e2ddf5c43db18463a06"

RPROVIDES:${PN} += "hypre-openmpi4-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2-20-0-openmpi4 \
superlu-devel"

inherit rpm
