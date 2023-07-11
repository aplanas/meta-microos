SUMMARY = "Gesture engine interface and support"
DESCRIPTION = "GEIS is a library for applications and toolkit programmers which \
provides a consistent platform independent interface for any \
system-wide input gesture recognition mechanism."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "geis-tools-2.2.17-4.10.aarch64.rpm"
RPM_HASH = "e6e82c9e8ffc20b3c5ff0c33977d85f9d623a968e2a6f49e8c32170f73f2ff0cee029b3b392e9b225907617d9ecb13a4f6eb7554e7c27860b04003be0e0a1819"

RPROVIDES:${PN} += "geis-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgeis.so.1 \
libxcb.so.1 \
python3-geis"

inherit rpm
