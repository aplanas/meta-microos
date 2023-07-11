SUMMARY = "Tile-based 2D Racing Game"
DESCRIPTION = "Dust Racing is a tile-based 2D racing game written with Qt (in C++) \
and OpenGL. Dust Racing comes with a Qt-based level editor for level \
creation. A separate engine, MiniCore, is used for physics modeling."
LICENSE = "GPL-3.0-only & CC-BY-SA-3.0"

PV = "2.1.1"

RPM_NAME = "dustrac-2.1.1-1.13.aarch64.rpm"
RPM_HASH = "e89543e9fc1642270de7f6f5bc8e959fb4bae131217fd51da1e12c2dac0b48e4b7b52d84b01d87210f996bd7bc72efacc8978b0eb469e61b78986df93ad30033"

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
