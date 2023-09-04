SUMMARY = "Selection window for emoji text input"
DESCRIPTION = "Press Meta+. to open an emoji selection window."
LICENSE = "GPL-2.0-only"

PV = "5.27.7.1"

RPM_NAME = "plasma5-desktop-emojier-5.27.7.1-1.1.aarch64.rpm"
RPM_HASH = "69e24dc2e0006c4c7285b9ca8f0ccd08c21bef791a113079e95081afdf0ed4ba5d2c1102ba1ced4f564782bedce63263650168be285b73765b315558b5fe86cf"

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
