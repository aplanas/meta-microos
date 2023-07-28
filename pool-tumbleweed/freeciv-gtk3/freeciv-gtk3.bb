SUMMARY = "Gtk3 client for freeciv"
DESCRIPTION = "Freeciv executable using Gtk3 library"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.8"

RPM_NAME = "freeciv-gtk3-3.0.8-1.1.aarch64.rpm"
RPM_HASH = "b9b837c3d8678141ad1acd9b416309abdb655f154ca0af5b6e8e995ab68051635107a921da66a0d5fde694b7819266b5c32480c4ac7c401789a8af05408cec04"

RPROVIDES:${PN} += "freeciv-client-3.0.8 \
freeciv-gtk3"

RDEPENDS:${PN} += "freeciv \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libicuuc.so.73 \
liblzma.so.5 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libz.so.1"

inherit rpm
