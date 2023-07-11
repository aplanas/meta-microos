SUMMARY = "Pixbuf document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read Pixbuf documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-pixbufdocument-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "437fd11c2129e5ca81e952d59d2b56f81c629106c61e92fa94e3694debfd62c7ecd0ffc273cacd96ba0fc93423a67c042da81c8c617e001eb888dd2dda4aed46"

RPROVIDES:${PN} += "libpixbufdocument.so \
xreader-plugin-pixbufdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
