SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi4-hpc-devel-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "377204bf8e7808e8ed3fa8923ef9a8a995256822e8079dd2b4f9ecdd440a44464e6368ac8e32ebfa8cef748fa289bcb90fd480dc4222f3f06a5d86f6297ecf83"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ocr-1-0-1-gnu-openmpi4-hpc \
openmpi4-gnu-hpc-devel"

inherit rpm
