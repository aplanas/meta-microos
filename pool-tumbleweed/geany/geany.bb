SUMMARY = "GTK-based integrated development environment"
DESCRIPTION = "Geany is a text editor using the GTK+ toolkit with basic features of \
an integrated development environment. It can do syntax highlighting \
for many formats, case folding, symbol name autocompletion, autoclose \
XML/HTML tags, provides code navigation and has a plugin interface."
LICENSE = "GPL-2.0-or-later"

PV = "1.38"

RPM_NAME = "geany-1.38-3.7.aarch64.rpm"
RPM_HASH = "76bf28cfee1e19bbbaf72ef2978e47ea90915db1bc0ee4a27b55957de9f0b2896ea3603ca40d824df897cf658f5eb9e5ab74e8fb7dbc72acedfabb5efab43332"

RPROVIDES:${PN} += "application() \
application(geany.desktop) \
geany \
geany(aarch-64) \
metainfo() \
metainfo(geany.appdata.xml) \
mimehandler(application/x-httpd-php3) \
mimehandler(application/x-httpd-php4) \
mimehandler(application/x-httpd-php5) \
mimehandler(application/x-php) \
mimehandler(application/xml) \
mimehandler(text/css) \
mimehandler(text/html) \
mimehandler(text/plain) \
mimehandler(text/x-c++hdr) \
mimehandler(text/x-c++src) \
mimehandler(text/x-chdr) \
mimehandler(text/x-csrc) \
mimehandler(text/x-diff) \
mimehandler(text/x-dsrc) \
mimehandler(text/x-java) \
mimehandler(text/x-pascal) \
mimehandler(text/x-perl) \
mimehandler(text/x-python) \
mimehandler(text/x-sql)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgeany.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
