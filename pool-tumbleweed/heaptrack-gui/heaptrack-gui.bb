SUMMARY = "GUI Frontend for Heaptrack"
DESCRIPTION = "A Qt5/KF5 based GUI for Heaptrack."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "heaptrack-gui-1.4.0-4.4.aarch64.rpm"
RPM_HASH = "b187c3da50eec47e3dd722608e42e0a2f96d391aa6534ba19e8d8ab56e04d6344c1ed13f03840f7b38d76c59d4fcc94cd4412fc79bf4b76d5acd07dc77377f4f"

RPROVIDES:${PN} += "application() \
application(org.kde.heaptrack.desktop) \
heaptrack-gui \
heaptrack-gui(aarch-64) \
metainfo() \
metainfo(org.kde.heaptrack.appdata.xml) \
mimehandler(application/x-heaptrack)"

RDEPENDS:${PN} += "heaptrack \
ld-linux-aarch64.so.1()(64bit) \
libKChart.so.2()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5ThreadWeaver.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
