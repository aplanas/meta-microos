SUMMARY = "Documentation for ocr_1_0_1-gnu-openmpi4-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi4-hpc-doc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "2ee0837d2f8116acbe80c9646dd6b44982c163d42fd4563480226ab38dfe25c7193e936b8e13f0859a54e39f1b0e8bcb60413f299614bfd4e27f3f2e53f6a839"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi4-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
