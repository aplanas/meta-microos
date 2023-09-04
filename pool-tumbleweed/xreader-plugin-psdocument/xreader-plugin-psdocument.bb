SUMMARY = "PostScript document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read PostScript documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-plugin-psdocument-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "a7b000a01baf95f672fcd20be531b4d638f6037aa2fea6afb8bd572fb266ff1fde5299138e04ed005a0afda2620af592100d027c08fd934f829fa3567912702e"

RPROVIDES:${PN} += "libpsdocument.so \
xreader-plugin-psdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libspectre.so.1 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
