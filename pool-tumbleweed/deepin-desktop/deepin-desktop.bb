SUMMARY = "Deepin Desktop"
DESCRIPTION = "Deepin desktop environment - desktop module."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-desktop-5.6.4-3.7.aarch64.rpm"
RPM_HASH = "157568611ad8917a9367affed325f0985c56d450cff902fe5cc7d4754812da796b3380a61b3ef190bacab60538b694f44be1e4c687f329b83e5d29d2855ed35d"

RPROVIDES:${PN} += "deepin-desktop \
deepin-desktop(aarch-64)"

RDEPENDS:${PN} += "libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdde-file-manager.so.5()(64bit) \
libdframeworkdbus.so.2()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-qt.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
