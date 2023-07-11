SUMMARY = "Examples for ocr_1_0_1-gnu-openmpi4-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi4-hpc-examples-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "f11de494b0c0e5d517213ce1da9c611927f3c60a2e16241b1aa93684aa60365398e92daaba580007994a4bb916abd64b178fa503a0d7682f88e2d30d3907081f"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi4-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
