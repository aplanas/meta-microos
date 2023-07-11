SUMMARY = "DjVu document support for Evince"
DESCRIPTION = "A plugin for Evince to read DjVu documents."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "evince-plugin-djvudocument-44.3-1.1.aarch64.rpm"
RPM_HASH = "829d02b905ee5d7ecf4fd333a4c8da4b8e72e1d5d9f2977eac54c251865ffd6072f4efd10708f02334c9a61423583bbdfaff07cf4b9258240c2d5c9618a6580a"

RPROVIDES:${PN} += "evince-plugin-djvudocument \
libdjvudocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdjvulibre.so.21 \
libevdocument3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
