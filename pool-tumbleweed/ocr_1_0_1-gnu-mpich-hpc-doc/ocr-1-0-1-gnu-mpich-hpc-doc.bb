SUMMARY = "Documentation for ocr_1_0_1-gnu-mpich-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mpich-hpc-doc-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "2a4dc6ed65de83983e29365a53d73f4cb8f5ddcde5d3c572d0cc44f783e6a5a7c55c81786fa22a7085fd01f6ce792ace68618c5e0fb21e86bcb02970dec5c071"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mpich-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
