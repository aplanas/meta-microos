SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi1-hpc-devel-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "cb430a58aff3fe58ec03def3e81c57fa9e9861028cadb25211dc501e860b277c6db4e1207ab47766d891aa61f7aa2a748074dda226231839ca72c7c9042dafac"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi1-hpc-devel \
ocr_1_0_1-gnu-openmpi1-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ocr_1_0_1-gnu-openmpi1-hpc \
openmpi1-gnu-hpc-devel"

inherit rpm
