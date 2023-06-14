SUMMARY = "Documentation for ocr_1_0_1-gnu-mpich-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mpich-hpc-doc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "ba2e288d7e91cdac32dd8ce5d26f7ed89fd469b2e04ad887db38358da56ff9c12ea575baec9efb43f31a2386c3064a9468abd690e6a6a58a02d6d0286cc35b3a"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mpich-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
