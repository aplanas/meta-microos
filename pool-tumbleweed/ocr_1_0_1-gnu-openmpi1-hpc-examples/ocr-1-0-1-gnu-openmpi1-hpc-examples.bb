SUMMARY = "Examples for ocr_1_0_1-gnu-openmpi1-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi1-hpc-examples-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "53fa7d72117f528ae91a662888c3503e5b813b9a612e8505e9db75628a9f2c7d6858e54e2346fa115a0b5464de56ad5b0e09a0442494513336b7016a61e1d969"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi1-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
