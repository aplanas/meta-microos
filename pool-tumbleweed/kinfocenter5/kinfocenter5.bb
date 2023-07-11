SUMMARY = "Utility that provides information about a computer system"
DESCRIPTION = "KDE Utility that provides information about a computer system."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "kinfocenter5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "5da72c271a1c3791a83a805841e9b04f4d2669d8e3b5d006b3ef223fa4a0a0e930930459d42585817dd73db2999b466dc0ec29aec3db57c9b767b94b79326054"

RPROVIDES:${PN} += "kinfocenter5 \
libKInfoCenterInternal.so"

RDEPENDS:${PN} += "/usr/bin/glxinfo \
/usr/bin/wayland-info \
/usr/bin/xdpyinfo \
baloo5-imports \
ld-linux-aarch64.so.1 \
libKF5AuthCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Package.so.5 \
libKF5QuickAddons.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0 \
pciutils \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.plasma.core.2 \
systemsettings5"

inherit rpm
