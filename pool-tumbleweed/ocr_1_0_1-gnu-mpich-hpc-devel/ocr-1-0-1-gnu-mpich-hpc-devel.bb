SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mpich-hpc-devel-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "01888cfb48c625963860c5cd840f5323be40a7915507980bd7bcfb4016cbbb80fe2e73f7bfb46e977f7faf4e4af5086c3dabeb92f0bd0a73b73727673f582040"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
mpich-gnu-hpc-devel \
ocr-1-0-1-gnu-mpich-hpc"

inherit rpm
