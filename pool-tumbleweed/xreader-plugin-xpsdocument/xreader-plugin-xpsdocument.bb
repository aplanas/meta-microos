SUMMARY = "XPS document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read XPS documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-plugin-xpsdocument-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "b905870aeabf82a09d902ae2a53cb1f5de647222319d681192146ec834871d169eb0df03e8708a872f695ec3e06ebd7965f437469f7446b71b4bcc66046abdc4"

RPROVIDES:${PN} += "libxpsdocument.so \
xreader-plugin-xpsdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgxps.so.2 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
