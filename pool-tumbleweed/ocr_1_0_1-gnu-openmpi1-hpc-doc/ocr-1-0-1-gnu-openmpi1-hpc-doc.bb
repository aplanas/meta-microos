SUMMARY = "Documentation for ocr_1_0_1-gnu-openmpi1-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi1-hpc-doc-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "d9a337c1ac28cfbc31a6aa0da30f487e0b79e08fde603164cbec0efc4f415fee8ad60a1f383605ee7807c6cbea67b7efba66cd15e38e366ecdd0824ed5909993"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi1-hpc-doc \
ocr_1_0_1-gnu-openmpi1-hpc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
