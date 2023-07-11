SUMMARY = "Reversi Game for GNOME"
DESCRIPTION = "Iagno is the two player strategy game of Othello, which is also known \
as Reversi and is similar to Go. The pieces are tiles that are black \
on one side and white on the other and the objective is for the player \
to flip his/her opponent's tiles to his/her color, while keeping the \
opponent from doing the same. Once the board is filled with tiles, the \
winner is the player with the most of his/her color tiles on the \
board."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.1"

RPM_NAME = "iagno-3.38.1-2.13.aarch64.rpm"
RPM_HASH = "958a80c1c8a5cc9ed0cb7df344fb93d32d166bc90fbdc253d1f5eb21b68f5a377ac263c9d031b864ed66e554ad35256d23c4c67607981f83da461f80c2ae2192"

RPROVIDES:${PN} += "iagno"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsound.so.0 \
libgtk-3.so.0 \
librsvg-2.so.2"

inherit rpm
