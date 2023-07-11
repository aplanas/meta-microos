SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi2-hpc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "5104ceca5df1896789a8160eb7a188575f16b1ce67409d8bfd4a810a442b661a2757316156f6d1ecc69837f32026cb556e35956e2b0b40e2960695c65af3b837"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
libopenmpi2-gnu-hpc \
lua-lmod \
openmpi2-gnu-hpc"

inherit rpm
