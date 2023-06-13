SUMMARY = "Documentation for ocr_1_0_1-gnu-openmpi4-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi4-hpc-doc-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "a38ad68da811f9c776e8579cd9f023dabe671df8e9b81e5ab2c26822177c90623a18866928ec20d003fd82b73a97e5acebaea3fbabf438ce8c4a03873bf969ec"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi4-hpc-doc \
ocr_1_0_1-gnu-openmpi4-hpc-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
