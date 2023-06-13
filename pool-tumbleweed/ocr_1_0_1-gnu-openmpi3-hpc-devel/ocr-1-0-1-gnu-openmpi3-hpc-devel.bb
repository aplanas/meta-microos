SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi3-hpc-devel-1.0.1-5.7.aarch64.rpm"
RPM_HASH = "9abfd094b538b01b94ceb4f10a0b50fe9de7130ef8a87aca4493c6c3d4fde1d7b4eb0bc3a56d380e66ce6b9232d339786e85fcea0456c52a5d7546542ee475d6"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi3-hpc-devel \
ocr_1_0_1-gnu-openmpi3-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ocr_1_0_1-gnu-openmpi3-hpc \
openmpi3-gnu-hpc-devel"

inherit rpm
