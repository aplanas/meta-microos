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

RPROVIDES:${PN} += "application() \
application(org.gnome.Reversi.desktop) \
iagno \
iagno(aarch-64) \
metainfo() \
metainfo(org.gnome.Reversi.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsound.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
librsvg-2.so.2()(64bit)"

inherit rpm
