SUMMARY = "Headers and library links for libHYPRE2_20_0-openmpi2"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-openmpi2-devel-2.20.0-1.10.aarch64.rpm"
RPM_HASH = "d3fd620e7d4d05d55eb5e26dad4148a6d1a538ec9b116d5dd3b82b1baed1311667dede85f9c1fc2b7371b0746ad784a7e4c8f6fb6c22bb844107504268fbac1c"

RPROVIDES:${PN} += "hypre-openmpi2-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2-20-0-openmpi2 \
superlu-devel"

inherit rpm
