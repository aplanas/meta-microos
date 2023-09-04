SUMMARY = "DVI document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read DVI documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.8.2"

RPM_NAME = "xreader-plugin-dvidocument-3.8.2-1.1.aarch64.rpm"
RPM_HASH = "ff0a206cc1076edb1f043964612e11a4cefad0b36d160b02da783d5e2be812d0dbc10b0a83906b4ff659971149100be9d5175a5f585d0dba0e249b3fada6739d"

RPROVIDES:${PN} += "libdvidocument.so \
xreader-plugin-dvidocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkpathsea.so.6 \
libm.so.6 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
