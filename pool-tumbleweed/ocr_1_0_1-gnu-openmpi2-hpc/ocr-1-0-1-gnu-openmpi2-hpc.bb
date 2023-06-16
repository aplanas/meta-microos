SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi2-hpc-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "f6ef87000557f6b04183e8df1791dcbe9afe4ea45d33316d1f1777e89162251aaec07b2df5b7edb2196530d9fd2a2553bac83ca996d0c6d85cbee8db8902cd52"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libopenmpi2-gnu-hpc \
lua-lmod \
openmpi2-gnu-hpc"

inherit rpm
