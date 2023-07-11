SUMMARY = "XPS document support for Evince"
DESCRIPTION = "A plugin for Evince to read XPS documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "evince-plugin-xpsdocument-44.3-1.1.aarch64.rpm"
RPM_HASH = "06c89ae1a704fe8cde93293d332114d3e11d8e8a85496b9babcba31575d9fc15827cac7077e09dd200d722482c3f6c74fd621465aeade3bdea1664da59f85469"

RPROVIDES:${PN} += "evince-plugin-xpsdocument \
libxpsdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgxps.so.2"

inherit rpm
