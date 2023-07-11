SUMMARY = "Documentation for ocr_1_0_1-gnu-mvapich2-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mvapich2-hpc-doc-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "c3172777f3d08ea7032d3e91065bb6ebc4ffa2d66de8dd5462dcec7cee97fb3ba2b8edd04f9d955cb14eac3ee5dd4e82e380ac1aba2f9c0df7c509add054e8d2"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mvapich2-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
