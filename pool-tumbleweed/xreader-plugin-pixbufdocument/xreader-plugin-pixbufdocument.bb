SUMMARY = "Pixbuf document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read Pixbuf documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-plugin-pixbufdocument-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "250be196a1cd1d0645c6d9ccaaf404f3f41c272514a3a1ac1f765486c4303c49a08e93b4f96d10afda812d59b92e607a61311894c22e8a8f3a374eafdac064b9"

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
