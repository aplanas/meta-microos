SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi3-hpc-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "33a9b8b3826fe6870441c7a635ab7d609cfe1fef662a1615c91c7e386e1656f8b09d374c87c48b4605e309cff04e2de8520ef3227df7797765485857ff30ecf8"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi3-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libopenmpi3-gnu-hpc \
lua-lmod \
openmpi3-gnu-hpc"

inherit rpm
