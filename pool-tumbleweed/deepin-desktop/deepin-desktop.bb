SUMMARY = "Deepin Desktop"
DESCRIPTION = "Deepin desktop environment - desktop module."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-desktop-5.6.4-3.9.aarch64.rpm"
RPM_HASH = "efff1117ce4ca117c2bfc32db7bd9a2e2119363fc5ccbe04d41a336bf12fcd28c8ed8149d841880bcfd947aba36e6f96de585fa3e57298837ecff8ca15c6750b"

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
