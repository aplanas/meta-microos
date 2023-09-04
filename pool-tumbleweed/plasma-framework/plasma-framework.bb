SUMMARY = "Plasma library and runtime components based upon KF5 and Qt5"
DESCRIPTION = "Plasma library and runtime components based upon KF5 and Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "plasma-framework-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "19407b3e7d811f50208fb7b026ecf916a4d3c2730d45a62b947d64149ccd82984db980e793dcb4bdfb5939f2de55862b688f754fd3f0085fcf1d0deb7b9d3f1b"

RPROVIDES:${PN} += "plasma-framework \
plasma-framework-private"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Kirigami2.so.5 \
libKF5Notifications.so.5 \
libKF5Package.so.5 \
libKF5Plasma.so.5 \
libKF5PlasmaQuick.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
