SUMMARY = "Examples for ocr_1_0_1-gnu-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-hpc-examples-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "d5f0d4569ca7dba04d33d5fb20ccea5aee9e0910130825bf041161e3404dacae25078245660f6ef5dcfd16c9358e99a1c457f72ef972b5fee10f1fed7ca48051"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
