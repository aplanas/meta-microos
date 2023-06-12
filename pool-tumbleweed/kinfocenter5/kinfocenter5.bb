SUMMARY = "Utility that provides information about a computer system"
DESCRIPTION = "KDE Utility that provides information about a computer system."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kinfocenter5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "4d1220e1bd609b5d01f8fc534defbaca61503cd27539ca76108c49829e4ad20b347b44cab40eab139c4425de35aa9aab67301896fca6a3d2a0cfc8a1fc6c53e4"

RPROVIDES:${PN} += "application() \
application(kcm_about-distro.desktop) \
application(org.kde.kinfocenter.desktop) \
kinfocenter5 \
kinfocenter5(aarch-64) \
libKInfoCenterInternal.so()(64bit) \
metainfo() \
metainfo(org.kde.kinfocenter.appdata.xml)"
RDEPENDS:${PN} += "(/usr/bin/vulkaninfo if libvulkan1) \
/usr/bin/glxinfo \
/usr/bin/wayland-info \
/usr/bin/xdpyinfo \
baloo5-imports \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5AuthCore.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Package.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libusb-1.0.so.0()(64bit) \
pciutils \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.plasma.core.2) \
systemsettings5"

inherit rpm
