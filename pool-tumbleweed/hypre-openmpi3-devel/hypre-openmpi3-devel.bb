SUMMARY = "Headers and library links for libHYPRE2_20_0-openmpi3"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi3 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-openmpi3-devel-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "024ea2433b3739ad20fcb1267a2cb005fb22effc1182b3644d9bc1164f6c03d6611c25d12e748a021aa4261cf048196ecd350781bebd1471c9e6df2c4ceb6a9c"

RPROVIDES:${PN} += "hypre-openmpi3-devel"

RDEPENDS:${PN} += "lapack-devel \
libHYPRE2-20-0-openmpi3 \
superlu-devel"

inherit rpm
