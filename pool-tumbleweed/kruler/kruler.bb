SUMMARY = "Screen Ruler"
DESCRIPTION = "A screen ruler for the Plasma desktop environment"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kruler-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3b2ef9896478f31f14f707b7e46cfa471345e26be1d78e4f86f0e0180e6e9ccc62ab78b25b74f68ef94b6ecb579a91c47ff8e89d5a811a36bb9a7b0fd6e66e56"

RPROVIDES:${PN} += "kruler \
kruler5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
