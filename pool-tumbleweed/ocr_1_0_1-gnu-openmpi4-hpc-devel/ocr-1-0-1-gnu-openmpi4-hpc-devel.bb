SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi4-hpc-devel-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "952784600852d4d4a3be31ab5b5505bac61f62f46712d119ad4b7c451792354f594b8e893f2127774fb1fcc77b188658a20914db4e6cd2d0aed25d22fc5e66c2"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi4-hpc-devel \
ocr_1_0_1-gnu-openmpi4-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ocr_1_0_1-gnu-openmpi4-hpc \
openmpi4-gnu-hpc-devel"

inherit rpm
