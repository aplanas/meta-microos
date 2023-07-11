SUMMARY = "Examples for ocr_1_0_1-gnu-openmpi2-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi2-hpc-examples-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "1c59280845957283e2c382111ed89bb06d8a3211c585f7e96d9de285084980c5ae1cdce817929d375901e28a4e32ec02d7d54808b52eb109956604feef19a8c6"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi2-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
