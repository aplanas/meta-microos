SUMMARY = "Open Community Runtime (OCR) for shared memory"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mpich-hpc-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "39c08cdaa7af924d7592f1f37aeff0a508ee632d9714c62a3d15607684701f7b1db8fbad0ce2484113acce6ead393b35ec76b34c458e981c7b031339a6453777"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mpich-hpc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gnu-compilers-hpc \
libc.so.6 \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
