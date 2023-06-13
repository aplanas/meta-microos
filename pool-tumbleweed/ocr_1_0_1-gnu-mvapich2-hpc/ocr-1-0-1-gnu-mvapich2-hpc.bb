SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mvapich2-hpc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "c91e6c81d484476466470efbb7c021bf9c835c56155a4dbdbd0599b3a530b8d6b10fa86ae936b4b85e4d42019e5203d02bd281ae3bdaa3edfdf6c8322715c0e6"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-mvapich2-hpc \
ocr_1_0_1-gnu-mvapich2-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
gnu-compilers-hpc \
libc.so.6(GLIBC_2.34)(64bit) \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
