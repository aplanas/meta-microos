SUMMARY = "Selection window for emoji text input"
DESCRIPTION = "Press Meta+. to open an emoji selection window."
LICENSE = "GPL-2.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-desktop-emojier-5.27.5-1.2.aarch64.rpm"
RPM_HASH = "00aa64ee9f50bc0bdaf1f4e6165a515cb1eadc28188600cf427cbfc88d33283174eba1e74d6cb13e3f9b1245b91e27587aaffabff7bd33fcf97c86fe7f3d3116"

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
