SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mpich-hpc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "68529712913458d8431966ed2db1845b57a613edf96746bbedfb2f22381f50ecc3c581ae26ddf234d7a718fa3be46bf86837385b528af4092d2791f90ca531d0"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-mpich-hpc \
ocr_1_0_1-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
gnu-compilers-hpc \
libc.so.6(GLIBC_2.34)(64bit) \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
