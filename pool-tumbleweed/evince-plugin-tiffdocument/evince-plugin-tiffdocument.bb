SUMMARY = "TIFF document support for Evince"
DESCRIPTION = "A plugin for Evince to read TIFF images."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "evince-plugin-tiffdocument-44.1-1.1.aarch64.rpm"
RPM_HASH = "444174831a79299475c57ced8cdd32cb97c3591ef32d235703d508c919d9de2032c9df75dc40387d632acbd0dae5aff30905df2a37394e5ccb78465fc4b6c07f"

RPROVIDES:${PN} += "evince-plugin-tiffdocument \
libtiffdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtiff.so.6"

inherit rpm
