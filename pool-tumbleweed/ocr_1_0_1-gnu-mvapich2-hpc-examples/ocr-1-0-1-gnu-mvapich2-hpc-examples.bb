SUMMARY = "Examples for ocr_1_0_1-gnu-mvapich2-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mvapich2-hpc-examples-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "0eacfae208660dfcbe99a02337fbbb6926179b7e2c44e2a586b9dcec020864067f334e450a5b23157302f407a9161452cad8a7c7e1e8d9206a4891d6ca540ff6"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mvapich2-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
