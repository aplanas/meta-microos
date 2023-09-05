SUMMARY = "Framework for searching and managing metadata"
DESCRIPTION = "Baloo is a framework for searching and managing metada"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "baloo5-widgets-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "a37df4c96d46ca5daed9ace0473257f9480d20c3f6a706cf7400a9a880bea0922123c7285f6f4cd5e17973bbfc36c2db8c0238b1475478c26715af793b62d96c"

RPROVIDES:${PN} += "baloo5-widgets \
libKF5BalooNaturalQueryParser1 \
libKF5BalooWidgets.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Baloo.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
