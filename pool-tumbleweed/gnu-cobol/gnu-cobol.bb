SUMMARY = "A COBOL compiler"
DESCRIPTION = "GnuCOBOL (formerly OpenCOBOL) is a COBOL compiler. \
cobc translates COBOL to executable using intermediate C sources, \
providing full access to nearly all C libraries."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.1.2"

RPM_NAME = "gnu-cobol-3.1.2-1.14.aarch64.rpm"
RPM_HASH = "dccc542753d788324b2f6f27d095ca3a0eae79c5954efe644c8186405cb2806ad827af3102b45d2815852b1517e3f97f65d176dcd2ea2aa14780dd0f62a95387"

RPROVIDES:${PN} += "gnu-cobol \
opencobol"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcob.so.4"

inherit rpm
