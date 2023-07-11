SUMMARY = "DVI document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read DVI documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-dvidocument-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "d715d4f8c51137b9f797237de0736996086ce8ae7d2660d3a7cb5de731c30475b92780170c21d14a8ec5eb2a9c87e63a9f4a18834767f141a226131e7ad6fe57"

RPROVIDES:${PN} += "libdvidocument.so \
xreader-plugin-dvidocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkpathsea.so.6 \
libm.so.6 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
