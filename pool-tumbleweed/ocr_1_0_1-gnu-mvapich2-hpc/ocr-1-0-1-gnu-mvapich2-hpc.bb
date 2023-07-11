SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mvapich2-hpc-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "d5eeba77e374709a30ae1811ea95aec29352f32d33fa636531c0cc23d379ee9281e418b50b6f3c1790282b005459da12f17a1f5c17e3820f796e42726b51a904"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
