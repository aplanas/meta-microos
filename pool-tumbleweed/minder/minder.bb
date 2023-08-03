SUMMARY = "Mind-mapping app"
DESCRIPTION = "A program to create, develop, visualize, organize and manage ideas."
LICENSE = "GPL-3.0-or-later"

PV = "1.15.2"

RPM_NAME = "minder-1.15.2-1.1.aarch64.rpm"
RPM_HASH = "1cbfd7fd54c984be66d85d40a52895e0365c8424a8640e4da55849cd4b1588e61cad476bd5a5550bca9b83a3327125dec686bc16146c79c1969ebec4e3992dff"

RPROVIDES:${PN} += "minder"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhandy-1.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libmarkdown.so.3 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
