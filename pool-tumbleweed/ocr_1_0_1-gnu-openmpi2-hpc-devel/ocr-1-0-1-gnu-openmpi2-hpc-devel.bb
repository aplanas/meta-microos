SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi2-hpc-devel-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "49eb079bf90450406e499839a392d340548447c584f0e4b7ed5c95557d9dfe2e1df2c2075386fee93409ea88f6d5d6d514482190848ef59c7484bf00d3ce7e0d"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi2-hpc-devel \
ocr_1_0_1-gnu-openmpi2-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ocr_1_0_1-gnu-openmpi2-hpc \
openmpi2-gnu-hpc-devel"

inherit rpm
