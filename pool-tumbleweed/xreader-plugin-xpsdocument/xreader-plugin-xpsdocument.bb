SUMMARY = "XPS document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read XPS documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-xpsdocument-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "02e38ea113a5103f594463ef74f39396a18dfef8f54237206e98a95c50cde2fd40bfef3f75af9a884cbb8ac28b128fe51ee3d19d073b2cc1cfd35788a9e657e0"

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
