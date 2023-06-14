SUMMARY = "Oxygen style"
DESCRIPTION = "This package contains the libraries of the Oxygen style."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "oxygen5-style-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "10055bd562dbce7fcc1b1787bca40b9c72d49811742307123f41ec413d9d57ed0ed2b558333fcb40daa014d758e8af4224192ca2c9250c0b7f77ba91c8595f96"

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
