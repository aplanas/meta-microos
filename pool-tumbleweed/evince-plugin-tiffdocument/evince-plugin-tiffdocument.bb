SUMMARY = "TIFF document support for Evince"
DESCRIPTION = "A plugin for Evince to read TIFF images."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "evince-plugin-tiffdocument-44.3-1.1.aarch64.rpm"
RPM_HASH = "11859b40e50b55f58d98a3835f83ff0020e3208fc226b6c1e462ed72110698915307d16db60a4afd0915cba3abd628ac0f4c81df4d97d95b7d73be66443d2cc8"

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
