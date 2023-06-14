SUMMARY = "Configuration tool for fcitx5"
DESCRIPTION = "Configuration tool for fcitx5"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-configtool-5.0.17-1.1.aarch64.rpm"
RPM_HASH = "072b401bc60aa35f981d6fda17ac9c2ad9cfd30803968bd8f58feefe6379dee027bd91b3c415ae53f598407bdb063674253f8b323df2b10c6fd4a47e192228b0"

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
