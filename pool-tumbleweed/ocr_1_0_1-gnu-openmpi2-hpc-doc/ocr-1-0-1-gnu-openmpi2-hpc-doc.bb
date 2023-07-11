SUMMARY = "Documentation for ocr_1_0_1-gnu-openmpi2-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi2-hpc-doc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "9d78d1507c6ea39a1ee84ed892bc47c1578801f0e3b69d8435ef0cc42f46bfafe26d5bf70f93a908da543451445352306c442a19ee2535d60b3959a55ccb3bde"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi2-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
