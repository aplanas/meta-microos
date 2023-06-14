SUMMARY = "Chess Game for GNOME"
DESCRIPTION = "This is a game for playing the classic board game of chess, in which \
two players simulate a battle by capturing the opponents pieces and \
ultimately the king. It can be played in 2D or 3D mode, full screen or \
in a window."
LICENSE = "GPL-3.0-or-later"

PV = "43.2"

RPM_NAME = "gnome-chess-43.2-1.1.aarch64.rpm"
RPM_HASH = "d53abc4266ea470f2d66f9ffbe0bb81abe629d091b0160abfbd8ef05d92f091ac38c2bce6ade38950df957ce72215a367d7fcff795ba8c2f6f3b17158a6ccc3d"

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
