SUMMARY = "A COBOL compiler"
DESCRIPTION = "GnuCOBOL (formerly OpenCOBOL) is a COBOL compiler. \
cobc translates COBOL to executable using intermediate C sources, \
providing full access to nearly all C libraries."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.1.2"

RPM_NAME = "gnu-cobol-3.1.2-2.1.aarch64.rpm"
RPM_HASH = "31862c3e17deab175836aacd8a975a391c85a59aae1b7e10c3de3b06b1c009e6eba871545e0b4a1c4a72d2595927dc62fa11ef055cca6137f38d50a4c14cfda4"

RPROVIDES:${PN} += "gnu-cobol \
libcob-devel \
opencobol"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcob.so.4"

inherit rpm
