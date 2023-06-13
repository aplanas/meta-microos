SUMMARY = "Configuration module for fcitx5"
DESCRIPTION = "Configuration module for fcitx5"
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17"

RPM_NAME = "kcm_fcitx5-5.0.17-1.1.aarch64.rpm"
RPM_HASH = "5819390278294f7459e3f1c628b36fc69afc8c8c2fad8c6d8a0a5ab4370adacb2064c12d29a6f60366677b5ac853ffbc31352208a132c2264b1b43dbe8a29964"

RPROVIDES:${PN} += "kcm5-fcitx \
kcm_fcitx5 \
kcm_fcitx5(aarch-64) \
kf5-kcm-fcitx \
kf5-kcm-fcitx-icons \
metainfo() \
metainfo(org.fcitx.fcitx5.kcm.appdata.xml)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Qt5DBusAddons.so.1()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Plasma.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
