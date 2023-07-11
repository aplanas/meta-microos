SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi4-hpc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "4b308fceeee11f19acaa65b39f9dd6cc369e0ef30250acc143ad36bcacfbda6f0d2a38e68812e5fe8183a88df3974f882d77f415738ba2f485bda0adda02337c"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libopenmpi4-gnu-hpc \
lua-lmod \
openmpi4-gnu-hpc"

inherit rpm
