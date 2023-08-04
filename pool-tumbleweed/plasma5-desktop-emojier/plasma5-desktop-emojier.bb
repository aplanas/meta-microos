SUMMARY = "Selection window for emoji text input"
DESCRIPTION = "Press Meta+. to open an emoji selection window."
LICENSE = "GPL-2.0-only"

PV = "5.27.7"

RPM_NAME = "plasma5-desktop-emojier-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "c5ac4dcf6e57fc7b53e4442a28ebb2711a03b18739959f1a7b89bc0d49b32d619ab2fd445e6f2c0dc921d0a606436bdc88a8164e2353f1cb9f422178e9c5b0ac"

RPROVIDES:${PN} += "plasma5-desktop-emojier"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6 \
plasma5-desktop"

inherit rpm
