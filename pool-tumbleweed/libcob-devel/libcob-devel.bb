SUMMARY = "Include files for the GnuCOBOL shared library"
DESCRIPTION = "GnuCOBOL (formerly OpenCOBOL) is a COBOL compiler. \
cobc translates COBOL to executable using intermediate C sources, \
providing full access to nearly all C libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.2"

RPM_NAME = "libcob-devel-3.1.2-1.13.aarch64.rpm"
RPM_HASH = "8c9250c6d14673ea599b402d426caafd10c3a99bd9d0a611b0927b4179327903c3fa6d8a075c53b8acce666f7a0892d43cfec908f7afd8f31270c85bb7089fc8"

RPROVIDES:${PN} += "libcob-devel"

RDEPENDS:${PN} += "libcob4"

inherit rpm
