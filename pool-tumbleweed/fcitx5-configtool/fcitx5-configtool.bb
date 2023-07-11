SUMMARY = "Configuration tool for fcitx5"
DESCRIPTION = "Configuration tool for fcitx5"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-configtool-5.0.17-1.2.aarch64.rpm"
RPM_HASH = "e012fd84cc4fc8d95464bf2b47620e9ade5e143fd07b0933996009575f0514f1c7ac805801bfca95c748609438d7aea5d8a39d81613bcaa5686e9b2264a4f373"

RPROVIDES:${PN} += "fcitx-config-gtk3 \
fcitx5-configtool \
libFcitx5Migrator.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Qt5DBusAddons.so.1 \
libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libKF5ItemViews.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxkbfile.so.1"

inherit rpm
