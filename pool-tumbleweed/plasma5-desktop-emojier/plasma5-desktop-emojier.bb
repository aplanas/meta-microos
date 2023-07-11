SUMMARY = "Selection window for emoji text input"
DESCRIPTION = "Press Meta+. to open an emoji selection window."
LICENSE = "GPL-2.0-only"

PV = "5.27.6"

RPM_NAME = "plasma5-desktop-emojier-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "0bb2262ff14104d695e16e064735a494c0c306a4d431c8f7e3de189718a133e877665502a7e732424fc20729f7946e95fbfc054c499e48f1ae58f6af958830ea"

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
