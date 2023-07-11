SUMMARY = "Configuration module for fcitx5"
DESCRIPTION = "Configuration module for fcitx5"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17"

RPM_NAME = "kcm_fcitx5-5.0.17-1.2.aarch64.rpm"
RPM_HASH = "ce8159d6a23074177e5213e5a822350cfb11d3e1d97863a7999ce13a1c7f18d9b9aa5cd17cc13ae0a1eee286f4f4065cb77283ccb813e46a9c1bfa66ca9ec221"

RPROVIDES:${PN} += "kcm-fcitx5 \
kcm5-fcitx \
kf5-kcm-fcitx \
kf5-kcm-fcitx-icons"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Qt5DBusAddons.so.1 \
libFcitx5Utils.so.2 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Plasma.so.5 \
libKF5QuickAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
