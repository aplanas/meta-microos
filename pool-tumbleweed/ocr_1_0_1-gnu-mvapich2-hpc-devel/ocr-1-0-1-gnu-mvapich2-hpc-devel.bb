SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mvapich2-hpc-devel-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "829c040f7d0b8357d6dc7cfb8161fcffaa9db1caef6feb788086d3737d8a4e542da3429488eaa78e529d6a53d20a4522cfe98b558f837b8ebbfa923c7cbd1896"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
mvapich2-gnu-hpc-devel \
ocr-1-0-1-gnu-mvapich2-hpc"

inherit rpm
