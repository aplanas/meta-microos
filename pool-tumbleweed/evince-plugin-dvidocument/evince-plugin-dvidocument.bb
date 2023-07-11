SUMMARY = "DVI document support for Evince"
DESCRIPTION = "A plugin for Evince to read DVI documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "evince-plugin-dvidocument-44.3-1.1.aarch64.rpm"
RPM_HASH = "5852920f52a5265bac8476a768570dea7a3aa0f8433909e76a8d55726df523fbfbb32ea2e34b9d71a31daabb458332138d92814363d9e55ec57943cad5e6acf8"

RPROVIDES:${PN} += "evince-plugin-dvidocument \
libdvidocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkpathsea.so.6 \
libm.so.6 \
libspectre.so.1"

inherit rpm
