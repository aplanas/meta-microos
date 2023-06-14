SUMMARY = "Onboarding wizard for Plasma"
DESCRIPTION = "Welcome Center is the perfect introduction to KDE Plasma! It can help you learn how to connect to the internet, install apps, customize the system, and more!"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-welcome-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "1a559cf844efb922a934c4e3a8ee9d998ab62b03407e94493c75dc824b714aec2189b7df5cd68136fa8d4aa9f074e067f9e6049e7a14d3503a0358d23cde9c61"

RPROVIDES:${PN} += "plasma5-welcome \
qt5qmlimport-org.kde.plasma.welcome.1"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.plasma.welcome.1"

inherit rpm
