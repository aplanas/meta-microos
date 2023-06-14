SUMMARY = "Deepin Desktop"
DESCRIPTION = "Deepin desktop environment - desktop module."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-desktop-5.6.4-3.7.aarch64.rpm"
RPM_HASH = "157568611ad8917a9367affed325f0985c56d450cff902fe5cc7d4754812da796b3380a61b3ef190bacab60538b694f44be1e4c687f329b83e5d29d2855ed35d"

RPROVIDES:${PN} += "deepin-desktop"

RDEPENDS:${PN} += "libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdde-file-manager.so.5 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libgio-qt.so.0 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
