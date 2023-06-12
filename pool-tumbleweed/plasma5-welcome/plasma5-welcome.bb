SUMMARY = "Onboarding wizard for Plasma"
DESCRIPTION = "Welcome Center is the perfect introduction to KDE Plasma! It can help you learn how to connect to the internet, install apps, customize the system, and more!"
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-welcome-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "1a559cf844efb922a934c4e3a8ee9d998ab62b03407e94493c75dc824b714aec2189b7df5cd68136fa8d4aa9f074e067f9e6049e7a14d3503a0358d23cde9c61"

RPROVIDES:${PN} += "application() \
application(org.kde.plasma-welcome.desktop) \
metainfo() \
metainfo(org.kde.plasma-welcome.appdata.xml) \
plasma5-welcome \
plasma5-welcome(aarch-64) \
qt5qmlimport(org.kde.plasma.welcome.1)"
RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.plasma.welcome.1)"

inherit rpm
