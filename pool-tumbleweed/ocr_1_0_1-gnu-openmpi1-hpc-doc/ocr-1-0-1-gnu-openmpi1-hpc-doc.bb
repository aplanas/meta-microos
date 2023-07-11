SUMMARY = "Documentation for ocr_1_0_1-gnu-openmpi1-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi1-hpc-doc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "d4cad506a3ef38ab32d07375b160382f2a9eeab709aecb37dcba04dbf34c35ad535c7f9730cd4f0d2c633e05c6ebe1ac081f83e2b7319a103843ab9ba01c9541"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi1-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
