SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi3-hpc-devel-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "6865624f813e2d5ac5a1db2dc26d282cef98f151858911e112c2ed3afae068c0a84e7cb1eda9ca00928c2e8e1f1c5bc2d3985c60a4f0aa2fbb41167882b6783d"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ocr-1-0-1-gnu-openmpi3-hpc \
openmpi3-gnu-hpc-devel"

inherit rpm
