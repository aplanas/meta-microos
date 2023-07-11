SUMMARY = "FreeWnn Korean Input System library"
DESCRIPTION = "This subpackage contains a core library of the Wnn input system."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "libkwnn0-1.1.1a023.1-4.4.aarch64.rpm"
RPM_HASH = "904faef1d21390849c0c09a1930f8d7d7ef539db251f4c7d7e459c9392b5196c1413f390b1c6b770d62d3164645f3cc3b645c48fdc4033a4c01b9a3faee007e1"

RPROVIDES:${PN} += "libkwnn.so.0 \
libkwnn0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
