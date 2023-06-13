SUMMARY = "Minesweeper Game for GNOME"
DESCRIPTION = "This is the popular logic puzzle minesweeper, which includes avoiding \
mines while receiving clues for the location of the mines."
LICENSE = "GPL-3.0-or-later"

PV = "40.1"

RPM_NAME = "gnome-mines-40.1-1.7.aarch64.rpm"
RPM_HASH = "81c7de718dc29c23b3f4d03332c6d9975139e4f3edd94cc1a8ae524ff9161c46a8d9cf596c2cdaeebc92d4a199ba4e5b50fcb54acee4168e7a3105d7c0269009"

RPROVIDES:${PN} += "application() \
application(org.gnome.Mines.desktop) \
gnome-mines \
gnome-mines(aarch-64) \
metainfo() \
metainfo(org.gnome.Mines.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-games-support-1.so.3()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
