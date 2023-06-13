SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi3-hpc-1.0.1-5.7.aarch64.rpm"
RPM_HASH = "619ad14564381f95b895e647337e1b0eefeff6e155be9cf30b8e871205b3fec98ca52149769f91f9127674c0fa85fe1697c359ff08683d92871fdd23d0b3e63a"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi3-hpc \
ocr_1_0_1-gnu-openmpi3-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
gnu-compilers-hpc \
libc.so.6(GLIBC_2.34)(64bit) \
libopenmpi3-gnu-hpc \
lua-lmod \
openmpi3-gnu-hpc"

inherit rpm
