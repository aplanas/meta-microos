SUMMARY = "Examples for ocr_1_0_1-gnu-openmpi3-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi3-hpc-examples-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "ee76f1a0f709d424df455f6e60c3f27f7ad8d8a4f58a4982a819b35c479817c75685eb84ddfcb30379d849d1a0be0350f9d7a2e627d0bbd00074e22374e8da00"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-openmpi3-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
