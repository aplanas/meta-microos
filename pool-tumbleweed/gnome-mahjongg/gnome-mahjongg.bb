SUMMARY = "Mahjong Solitaire Game for GNOME"
DESCRIPTION = "Mahjongg is a solitaire version of the classic Eastern tile game. It \
involves clearing as much of the board as possible by matching \
corresponding tiles and taking them out of play."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "gnome-mahjongg-3.40.0-1.1.aarch64.rpm"
RPM_HASH = "d5d6b3a6ac16d72758fbe3c528c859c9a922ad7cd5c0cfb59d40f4acea79d946b0c618d3e2403fc236e13f39cdb534a2b60321577ea8b849afedffdd6c5db418"

RPROVIDES:${PN} += "gnome-mahjongg \
mahjongg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
librsvg-2.so.2"

inherit rpm
