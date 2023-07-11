SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-hpc-devel-1.0.1-5.10.aarch64.rpm"
RPM_HASH = "bb7a3f3c1ac30fa1346b1047aedb63ad31eb881016fe1a5a1ec74da6cdef746b3009ab21050d4e953f62ed1aed3a13d23b42cdac9f036759fd95f712019a5c40"

RPROVIDES:${PN} += "ocr-1-0-1-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ocr-1-0-1-gnu-hpc"

inherit rpm
