SUMMARY = "Tile-based 2D Racing Game"
DESCRIPTION = "Dust Racing is a tile-based 2D racing game written with Qt (in C++) \
and OpenGL. Dust Racing comes with a Qt-based level editor for level \
creation. A separate engine, MiniCore, is used for physics modeling."
LICENSE = "GPL-3.0-only & CC-BY-SA-3.0"

PV = "2.1.1"

RPM_NAME = "dustrac-2.1.1-1.12.aarch64.rpm"
RPM_HASH = "8ed61f1d66f9b7c3414590d1bef956090ca5d7c815d1c5ac50a4fb1b5a937087f80034c2ac46b318fafa10012edc91d4d23c24e26bcdc1d82a448434ee41985d"

RPROVIDES:${PN} += "dustrac"

RDEPENDS:${PN} += "dejavu-fonts \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libvorbisfile.so.3"

inherit rpm
