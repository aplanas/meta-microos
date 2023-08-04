SUMMARY = "Oxygen style"
DESCRIPTION = "This package contains the libraries of the Oxygen style."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "oxygen5-style-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "f3b5f23f6b10c21028e29dfd23f6b0d40b4a94fdbe3a6689e608c1aeefedbfbfb001315db46fe98ae740f5b6b2d4eeee70c4e5b56e1457ba4b5a2309b89dc2a7"

RPROVIDES:${PN} += "liboxygenstyle5.so.5 \
liboxygenstyleconfig5.so.5 \
oxygen-style5 \
oxygen5-style"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5KCMUtils.so.5 \
libKF5Style.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1 \
qt5qmlimport-QtQuick.2"

inherit rpm
