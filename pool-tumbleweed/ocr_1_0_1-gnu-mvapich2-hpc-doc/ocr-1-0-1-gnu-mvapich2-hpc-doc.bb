SUMMARY = "Documentation for ocr_1_0_1-gnu-mvapich2-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mvapich2-hpc-doc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "53861106b72372a8ea01c10743a247d8fa7a6fda48df7fa73bc02084a40201cea187643cba6ae10d34296089feefd5f252635268d7894a4d4eaae51c8b382c76"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
