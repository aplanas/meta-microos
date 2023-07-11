SUMMARY = "Documentation for ocr_1_0_1-gnu-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-hpc-doc-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "1550fc3453d41ff10c18c91271a122143d18697a4866d17b97d215125c2d8990e951719803de175629a763ae5c1e111e394498642057927796cacf54f375fa0e"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
