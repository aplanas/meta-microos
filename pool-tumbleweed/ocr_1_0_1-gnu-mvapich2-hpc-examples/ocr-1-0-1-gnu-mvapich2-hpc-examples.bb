SUMMARY = "Examples for ocr_1_0_1-gnu-mvapich2-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mvapich2-hpc-examples-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "21278c8d954b370fb37b3621d4f6fa5dece48d97d6e974559d43f4c12d2fa290c98ea116316cac8e7e1bfc900dd2a083b89c985ddcd6dcfeed1533863ad5621f"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mvapich2-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
