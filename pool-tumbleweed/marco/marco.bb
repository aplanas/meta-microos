SUMMARY = "MATE window manager"
DESCRIPTION = "Marco is a small window manager, using GTK+ to do everything. It is \
developed mainly for the MATE Desktop."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.2"

RPM_NAME = "marco-1.26.2-1.1.aarch64.rpm"
RPM_HASH = "f395f58b7d81c8c2992482c8a4a758621bf540e7b19415ddf9b74298f79397af3970b6552cde0c165de6a07e0e6a97a1417950b208b5d183211644d3b205a91d"

RPROVIDES:${PN} += "marco \
mate-window-manager \
windowmanager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmarco-private.so.2 \
libpango-1.0.so.0 \
zenity"

inherit rpm
