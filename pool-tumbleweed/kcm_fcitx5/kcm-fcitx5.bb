SUMMARY = "Configuration module for fcitx5"
DESCRIPTION = "Configuration module for fcitx5"
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "kcm_fcitx5-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "43a531e0f0f36c0de18084e3029a110d9d73bc434e6ea14e84f50fb68802dd134aed53943f59598471f8b80ca7ead95b634d29c73fdda2c1119ac04b848047c8"

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
