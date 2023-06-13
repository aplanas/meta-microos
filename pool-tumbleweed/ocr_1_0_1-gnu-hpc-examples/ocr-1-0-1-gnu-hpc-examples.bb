SUMMARY = "Examples for ocr_1_0_1-gnu-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-hpc-examples-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "7b4064779ad7b5be781c183acf213b125fc1fb9167c61cd9ced4d68ef737f957c7600ac989e8da0bce9b11197064ddeb10f0b244e086ebd5a74a51ebfee836f7"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-hpc-examples \
ocr_1_0_1-gnu-hpc-examples(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
