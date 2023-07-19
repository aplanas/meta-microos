SUMMARY = "C library for the subunit testing protocol"
DESCRIPTION = "Subunit C bindings.  See the python-subunit package for test processing \
functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-1.4.2-3.1.aarch64.rpm"
RPM_HASH = "045ccf2e10e8379427fa130cfd897851b1ab81d69c357ef017c0eb059ddef4d3792956d5e30b102285ca96ad6ecd3ec97aa1a0febcf35eb24a20e6649c7a43d6"

RPROVIDES:${PN} += "subunit"

RDEPENDS:${PN} += ""

inherit rpm
