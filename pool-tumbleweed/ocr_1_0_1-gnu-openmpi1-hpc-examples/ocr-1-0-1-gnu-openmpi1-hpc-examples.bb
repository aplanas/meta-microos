SUMMARY = "Examples for ocr_1_0_1-gnu-openmpi1-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi1-hpc-examples-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "4de908d677585221fbb22549016413c4140f7356860961d1f6b9418f1362e98a70163e17c5dd7a189bdf9062f26f449a8d557f153ca2efb745b6c068b508274e"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi1-hpc-examples \
ocr_1_0_1-gnu-openmpi1-hpc-examples(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
