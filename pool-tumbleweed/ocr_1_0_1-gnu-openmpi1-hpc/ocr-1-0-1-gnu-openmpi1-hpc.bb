SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi1-hpc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "739eaaea658c7036eeeaed0d36daa88c0cd713e116da7bebd07d07e2e3b3445624eb2ff54b2c2a26cb0b3cdd7148d612d54c3c90ca6d7876a3c29b1cbd914947"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libopenmpi1-gnu-hpc \
lua-lmod \
openmpi1-gnu-hpc"

inherit rpm
