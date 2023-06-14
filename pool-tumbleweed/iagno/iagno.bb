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

RPM_NAME = "iagno-3.38.1-2.12.aarch64.rpm"
RPM_HASH = "4a7108dbcfab146b7fe3a325dfc98febbe5dd6d31f5ecf0d7d258eb76aa35cc48a6b7a619e2208b943830b50fd3df32b0d52f5328ddb08b717e4c3132557f203"

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
