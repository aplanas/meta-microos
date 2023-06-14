SUMMARY = "A COBOL compiler"
DESCRIPTION = "GnuCOBOL (formerly OpenCOBOL) is a COBOL compiler. \
cobc translates COBOL to executable using intermediate C sources, \
providing full access to nearly all C libraries."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.1.2"

RPM_NAME = "gnu-cobol-3.1.2-1.13.aarch64.rpm"
RPM_HASH = "5ecf8623e58dcc8e12d84e3d41a896bcb64280dab8a8e2f48228eb8590e09af77a4399657756c52f3424db72fa40bb5982b967cfb3ac4e902360d818e37d961d"

RPROVIDES:${PN} += "gnu-cobol \
opencobol"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcob.so.4"

inherit rpm
