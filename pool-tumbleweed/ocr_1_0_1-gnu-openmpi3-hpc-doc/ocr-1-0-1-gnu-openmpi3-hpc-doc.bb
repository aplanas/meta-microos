SUMMARY = "Documentation for ocr_1_0_1-gnu-openmpi3-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi3-hpc-doc-1.0.1-5.7.aarch64.rpm"
RPM_HASH = "214e52f29aaf889ddc203ee406935a100f0add3f7677b73f4244bf1ed11c8ccfaf09e2a61672009fdcffea67cb32b7810d006e559adf15de1d98ab7c42d28c83"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi3-hpc-doc \
ocr_1_0_1-gnu-openmpi3-hpc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
