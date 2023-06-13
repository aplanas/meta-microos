SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi1-hpc-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "3d79f23e7e7ee29c7f14c7263e16b9f1f4f9cc49a4a01bc8a0220ff2614d662cfbc90233b33f1181e1c3a326fe49878fa6e2d64b5cadd61407dac53eb67c86b4"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi1-hpc \
ocr_1_0_1-gnu-openmpi1-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
gnu-compilers-hpc \
libc.so.6(GLIBC_2.34)(64bit) \
libopenmpi1-gnu-hpc \
lua-lmod \
openmpi1-gnu-hpc"

inherit rpm
