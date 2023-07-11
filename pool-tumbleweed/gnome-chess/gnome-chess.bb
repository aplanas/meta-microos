SUMMARY = "Chess Game for GNOME"
DESCRIPTION = "This is a game for playing the classic board game of chess, in which \
two players simulate a battle by capturing the opponents pieces and \
ultimately the king. It can be played in 2D or 3D mode, full screen or \
in a window."
LICENSE = "GPL-3.0-or-later"

PV = "43.2"

RPM_NAME = "gnome-chess-43.2-1.2.aarch64.rpm"
RPM_HASH = "97fff67e51617538820a5b5ab5486386372f271d4a3d397faf503252235c25c45b917288a7a1ef06e0b3dfcd0b2cebff1016e6839c069d9e91c3bfada9b20e77"

RPROVIDES:${PN} += "config-gnome-chess \
gnome-chess"

RDEPENDS:${PN} += "chess-backend \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
librsvg-2.so.2"

inherit rpm
