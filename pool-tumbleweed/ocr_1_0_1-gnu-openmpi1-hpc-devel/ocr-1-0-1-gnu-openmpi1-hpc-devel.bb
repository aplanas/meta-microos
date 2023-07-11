SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi1-hpc-devel-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "bd77694f50bd3eefc618c84285783417011bcfd5b7b0cef12ebfcead0c454bcbcee4dcda07056e4d5efac8062d6626fe3cc81080a52458a9a5d854999fcf9ed1"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ocr-1-0-1-gnu-openmpi1-hpc \
openmpi1-gnu-hpc-devel"

inherit rpm
