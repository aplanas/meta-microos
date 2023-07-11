SUMMARY = "Examples for ocr_1_0_1-gnu-mpich-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mpich-hpc-examples-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "be911890b1392032072ab77f56eedc936f8160b5ca04ecca47ded75e9f3623f0d49b47ce287c9107e1f6fcc0b745a1b96d5a564f37be5658b2aae1c8598da98f"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-mpich-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
