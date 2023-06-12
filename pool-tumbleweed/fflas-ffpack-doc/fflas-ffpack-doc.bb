SUMMARY = "API documentation for FFLAS-FFPACK"
DESCRIPTION = "The FFLAS-FFPACK library provides functionalities for dense linear \
algebra over word size prime finite field. \
 \
This subpackage contains the Doxygen-generated HTML documentation for \
the FFLAS-FFPACK API."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "fflas-ffpack-doc-2.5.0-1.5.noarch.rpm"
RPM_HASH = "f3794c8c7b0942d2a1bde31d4e72388b6b68d5fd99c099097c219f94bbef89b9b55c5ff211852d6647f6e80d0639c5a3db951c33f5b70503be03a2a7bfc1de38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fflas-ffpack-doc"
RDEPENDS:${PN} += ""

inherit rpm
