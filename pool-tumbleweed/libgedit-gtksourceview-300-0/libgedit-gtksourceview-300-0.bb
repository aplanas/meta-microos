SUMMARY = "libgedit-gtksourceview shared library"
DESCRIPTION = "The libgedit-gtksourceview shared library."
LICENSE = "LGPL-2.1-or-later"

PV = "299.0.3"

RPM_NAME = "libgedit-gtksourceview-300-0-299.0.3-1.1.aarch64.rpm"
RPM_HASH = "8b238fd68507b5a6a0e9cf235a9f65c36a05affb71bdf0339e12205a5896289f69285b270148341d19d6fb6e83befbd6d3b8495107ecfa11083eb1f6e8091d78"

RPROVIDES:${PN} += "libgedit-gtksourceview-300-0 \
libgedit-gtksourceview-300.so.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgedit-gtksourceview \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
