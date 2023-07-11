SUMMARY = "Deepin Video Players"
DESCRIPTION = "The default media player for Deepin. QML is used to build its \
graphical interface, combined with QtAV as its multimedia backend."
LICENSE = "GPL-3.0-or-later & OpenSSL"

PV = "5.10.8"

RPM_NAME = "deepin-movie-5.10.8-1.6.aarch64.rpm"
RPM_HASH = "18a10db2a1b7fc0c2e89078d93089b7a1643c186e184700eaf4c4a33e3336b5ad9a1af15e47a562339f5c3aa354712d324b77ab18933ace33c4f38ffe70aa0f4"

RPROVIDES:${PN} += "deepin-movie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsettings-qt.so.1 \
libmpris-qt5.so.1 \
libstdc++.so.6 \
libxcb-shape.so.0 \
libxcb.so.1"

inherit rpm
