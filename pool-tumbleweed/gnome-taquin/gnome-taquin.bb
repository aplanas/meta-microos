SUMMARY = "A computer version of the 15-puzzle and other sliding puzzles"
DESCRIPTION = "Taquin is a computer version of the 15-puzzle and other sliding puzzles. \
 \
The object of Taquin is to move tiles so that they reach their places, \
either indicated with numbers, or with parts of a great image."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.1"

RPM_NAME = "gnome-taquin-3.38.1-2.12.aarch64.rpm"
RPM_HASH = "d8b783f7446b9d4eb37b39088d3e2cb11460b2e656f401d0575be35b0fef0e555380be4fa55f31f639107582502b42a8f555d2c384b927a8779c89c55d36d4b6"

RPROVIDES:${PN} += "application() \
application(org.gnome.Taquin.desktop) \
gnome-taquin \
gnome-taquin(aarch-64) \
metainfo() \
metainfo(org.gnome.Taquin.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgsound.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
