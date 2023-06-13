SUMMARY = "Examples for ocr_1_0_1-gnu-openmpi2-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi2-hpc-examples-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "41296d0012cda52976d93072aba581f8e0c7a278364881eec7fbe202e4a52f3178e9ffdfe0b1d9b8c681dbf2c601c8b46edc7f60c24530fe08b971395d005e33"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi2-hpc-examples \
ocr_1_0_1-gnu-openmpi2-hpc-examples(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
