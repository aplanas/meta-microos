SUMMARY = "Utility that provides information about a computer system"
DESCRIPTION = "KDE Utility that provides information about a computer system."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kinfocenter5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "f215b19b19243648b6c1de9267b5c49866c58123ce7ff1b630e00acea424a83ccf6f13149131f69b6e3a29b5e4ba857c60dfb8106f9985d98745e28e539f6d68"

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
