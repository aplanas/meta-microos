SUMMARY = "Provides libknet1 zlib support"
DESCRIPTION = "Provides zlib compression support for libknet1."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-compress-zlib-plugin-1.21-1.10.aarch64.rpm"
RPM_HASH = "c54b8ae8ddfbb3b7f75e4b89092a0676c9315886b01da0fede881eddd5226c63a8f72128ba3fe57aa4f51845f69a5b8a9ca97ef7a7e82b1b8781adc77a006204"

RPROVIDES:${PN} += "libknet1-compress-zlib-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libknet1 \
libz.so.1"

inherit rpm
