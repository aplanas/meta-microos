SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi4-hpc-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "99a379b6376834aa3dc8545de969becef5808db18c252398987a99b7ca5eeaf0909aad8ec03eae71673698d699391482e229bdbabdc4c0a1a62b2376285b5c49"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libopenmpi4-gnu-hpc \
lua-lmod \
openmpi4-gnu-hpc"

inherit rpm
