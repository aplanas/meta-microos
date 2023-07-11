SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-hpc-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "547fd1a4cff2b449572850d7bb34837f8c6ab413bc0beb0abc0e2ba2208f0eb6e20c386a73f41b4078cd7b2e58fe933e98358f1c1c1c5fc26bf1507fb89c0cbe"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
lua-lmod"

inherit rpm
