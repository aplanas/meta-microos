SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "KDE Framework for providing different actions given a string query."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Runner5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "195d9f292c9b91df5dd44860540182617744388318e98ef6b457fd3bc3b4f7f3d9a69e01d3c4efcbceb64a37afbc24cc9c4c2605019da2596939a98718c47fe9"

RPROVIDES:${PN} += "libKF5Runner.so.5 \
libKF5Runner5 \
librunnermodelplugin.so \
qt5qmlimport-org.kde.runnermodel.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5Plasma.so.5 \
libKF5Service.so.5 \
libKF5ThreadWeaver.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
