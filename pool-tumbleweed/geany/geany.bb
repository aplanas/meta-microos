SUMMARY = "GTK-based integrated development environment"
DESCRIPTION = "Geany is a text editor using the GTK+ toolkit with basic features of \
an integrated development environment. It can do syntax highlighting \
for many formats, case folding, symbol name autocompletion, autoclose \
XML/HTML tags, provides code navigation and has a plugin interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "geany-1.38-3.7.aarch64.rpm"
RPM_HASH = "76bf28cfee1e19bbbaf72ef2978e47ea90915db1bc0ee4a27b55957de9f0b2896ea3603ca40d824df897cf658f5eb9e5ab74e8fb7dbc72acedfabb5efab43332"

RPROVIDES:${PN} += "geany"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgeany.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
