SUMMARY = "GUI Frontend for Heaptrack"
DESCRIPTION = "A Qt5/KF5 based GUI for Heaptrack."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "heaptrack-gui-1.4.0-4.4.aarch64.rpm"
RPM_HASH = "b187c3da50eec47e3dd722608e42e0a2f96d391aa6534ba19e8d8ab56e04d6344c1ed13f03840f7b38d76c59d4fcc94cd4412fc79bf4b76d5acd07dc77377f4f"

RPROVIDES:${PN} += "heaptrack-gui"

RDEPENDS:${PN} += "heaptrack \
ld-linux-aarch64.so.1 \
libKChart.so.2 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOWidgets.so.5 \
libKF5ThreadWeaver.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
