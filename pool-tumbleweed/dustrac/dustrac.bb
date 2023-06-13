SUMMARY = "Tile-based 2D Racing Game"
DESCRIPTION = "Dust Racing is a tile-based 2D racing game written with Qt (in C++) \
and OpenGL. Dust Racing comes with a Qt-based level editor for level \
creation. A separate engine, MiniCore, is used for physics modeling."
LICENSE = "GPL-3.0-only & CC-BY-SA-3.0"

PV = "2.1.1"

RPM_NAME = "dustrac-2.1.1-1.12.aarch64.rpm"
RPM_HASH = "8ed61f1d66f9b7c3414590d1bef956090ca5d7c815d1c5ac50a4fb1b5a937087f80034c2ac46b318fafa10012edc91d4d23c24e26bcdc1d82a448434ee41985d"

RPROVIDES:${PN} += "application() \
application(dustrac-editor.desktop) \
application(dustrac-game.desktop) \
dustrac \
dustrac(aarch-64) \
metainfo() \
metainfo(dustrac.appdata.xml)"

RDEPENDS:${PN} += "dejavu-fonts \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libopenal.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libvorbisfile.so.3()(64bit)"

inherit rpm
