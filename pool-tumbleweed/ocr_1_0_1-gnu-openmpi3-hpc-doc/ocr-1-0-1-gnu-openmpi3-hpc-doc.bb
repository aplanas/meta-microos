SUMMARY = "Documentation for ocr_1_0_1-gnu-openmpi3-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi3-hpc-doc-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "ad705fe0475312450e1e12699ee737bbb81ad99ca5c0c7d46fd998ce9be7b623da8ceff43993a6c3d6459d33c4369692dd2e66427a093b323f4734e8c08c6763"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi3-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
