SUMMARY = "Comics document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read Comics documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-comicsdocument-3.4.5-1.5.aarch64.rpm"
RPM_HASH = "236c36ba3f24b2f70cefec1cfabb0f7d63cc5e6a114703e2e0b65b8ee36c8b862b45c9f8ac00d319361a188cd480493a86aa5c0790c68590ef642252839f6222"

RPROVIDES:${PN} += "libcomicsdocument.so \
xreader-plugin-comicsdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
