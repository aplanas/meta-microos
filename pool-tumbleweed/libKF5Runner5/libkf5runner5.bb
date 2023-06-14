SUMMARY = "KDE Framework for providing different actions given a string query"
DESCRIPTION = "KDE Framework for providing different actions given a string query."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Runner5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "a1e6b1ade8a24c1a6538a2392c4dc4c5347b0ba9d922fce25e63111e0f1a20af9a82a1ddeb16a6c8f0459bb67db6f28a8b1d151e1cbaa159e39dbc093f66d586"

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
