SUMMARY = "Framework for searching and managing metadata"
DESCRIPTION = "Baloo is a framework for searching and managing metada"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "baloo5-widgets-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a97f0fa015372735559710c2817619ef0f06a0a6ffb71eb7aabc34e89825e9531d27f6babc55b1d9b43a31394bb4c641020b499a10e3c5d99de3a086bea3d188"

RPROVIDES:${PN} += "baloo5-widgets \
baloo5-widgets(aarch-64) \
libKF5BalooNaturalQueryParser1 \
libKF5BalooWidgets.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Baloo.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
