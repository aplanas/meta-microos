SUMMARY = "Configuration tool for fcitx5"
DESCRIPTION = "Configuration tool for fcitx5"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-configtool-5.0.17-1.1.aarch64.rpm"
RPM_HASH = "072b401bc60aa35f981d6fda17ac9c2ad9cfd30803968bd8f58feefe6379dee027bd91b3c415ae53f598407bdb063674253f8b323df2b10c6fd4a47e192228b0"

RPROVIDES:${PN} += "application() \
application(kbd-layout-viewer5.desktop) \
application(org.fcitx.fcitx5-config-qt.desktop) \
application(org.fcitx.fcitx5-migrator.desktop) \
fcitx-config-gtk3 \
fcitx5-configtool \
fcitx5-configtool(aarch-64) \
libFcitx5Migrator.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Qt5DBusAddons.so.1()(64bit) \
libFcitx5Qt5WidgetsAddons.so.2()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libxkbfile.so.1()(64bit)"

inherit rpm
