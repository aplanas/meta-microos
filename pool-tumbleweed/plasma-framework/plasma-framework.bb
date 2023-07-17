SUMMARY = "Plasma library and runtime components based upon KF5 and Qt5"
DESCRIPTION = "Plasma library and runtime components based upon KF5 and Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "plasma-framework-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "3832c6532e0c93438b58b27b1c182ef1f48aba59b998cd4ffaea1285978231c52ab0c65fec4533b1bc780ffd12763ebdf609135534f3dd7a7b19755d4bf9ba06"

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
