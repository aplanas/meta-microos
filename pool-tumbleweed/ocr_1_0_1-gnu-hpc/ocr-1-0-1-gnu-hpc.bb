SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-hpc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "5d0a45b2e54877a4f0ddd920fa36a014b1e54d26c3e7c174a6c65254c45e029c3de98011164f0a17b7aaccd744a680c569c9d534df2a1de18ec8eadacbe67a5b"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-hpc \
ocr_1_0_1-gnu-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
gnu-compilers-hpc \
libc.so.6()(64bit) \
lua-lmod"

inherit rpm
