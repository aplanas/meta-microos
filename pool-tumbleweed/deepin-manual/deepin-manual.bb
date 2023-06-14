SUMMARY = "Deepin Manual"
DESCRIPTION = "Deepin Manual is designed to help users learn the operating system and its \
applications, providing specific instructions and function descriptions."
LICENSE = "GPL-3.0-or-later"

PV = "5.8.12"

RPM_NAME = "deepin-manual-5.8.12-1.9.aarch64.rpm"
RPM_HASH = "d129d7ce711493c5364bd3a4ccce1f632bea6fd3b6eeba61e572252cba90872a1ef635d4a7582c2d07e24d97209c5490991a8e4817dbf03ef58fb4d4ab065248"

RPROVIDES:${PN} += "deepin-manual"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5WebChannel.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libstdc++.so.6"

inherit rpm
