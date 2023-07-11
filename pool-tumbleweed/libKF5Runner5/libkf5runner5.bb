SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "KDE Framework for providing different actions given a string query."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Runner5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "a67d21c51576a2dece9a4b6af27a726ce1b49224f0fc73e8733ae89b1e8bc7e470a728d341a511c9bbde73691ef6d0fda74008870213aeb69b8b0af47f68f332"

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
