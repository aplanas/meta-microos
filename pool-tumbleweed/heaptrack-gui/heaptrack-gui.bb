SUMMARY = "GUI Frontend for Heaptrack"
DESCRIPTION = "A Qt5/KF5 based GUI for Heaptrack."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "heaptrack-gui-1.4.0-4.5.aarch64.rpm"
RPM_HASH = "b63cd99b4617330a053cd0c49e590a5d019b03c985ef323c28a298f455221a1a58d90208e51cd5862e245e532cbfa2c01615693cd8323781d5d353e4a13bdb14"

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
