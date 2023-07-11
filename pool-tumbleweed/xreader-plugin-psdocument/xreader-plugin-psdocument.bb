SUMMARY = "PostScript document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read PostScript documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-psdocument-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "0e14ca7324220a97bacec70ce51bf317016db6bce63c495220a33cd032da23c5e6c5e983b881f718fe1323e512fbb0a587b09d67aa20aa057405df19ed35c78f"

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
