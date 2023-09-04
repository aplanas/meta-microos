SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "KDE Framework for providing different actions given a string query."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Runner5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "0ac72daba5263ab3f946f95cd71d4b14b5f09a1caafde0e3ea7c2d7b125c76befdfa489321d6e7f920e888a970c698c3171465f91ce35b881f4c04b55f00e82f"

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
