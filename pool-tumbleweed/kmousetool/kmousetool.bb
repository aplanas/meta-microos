SUMMARY = "Automatic Mouse Click"
DESCRIPTION = "Clicks the mouse for you, reducing hand strain."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kmousetool-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "21d8575a515b21d7e6b4e3d2168b6238be4dc46739d5f13271b59e938e0ced8e1d32ea6b8852c21988e3422fdd9c8b548ce04e29c8bdfee5a490600d0f895f7c"

RPROVIDES:${PN} += "kmousetool \
kmousetool5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
