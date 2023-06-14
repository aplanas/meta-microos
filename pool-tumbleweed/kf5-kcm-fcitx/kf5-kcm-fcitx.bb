SUMMARY = "KF5 control module for Fcitx"
DESCRIPTION = "KF5 control module for Fcitx. \
 \
You can config fcitx through 'Configure Desktop' - 'Locale' - Fcitx now."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.6"

RPM_NAME = "kf5-kcm-fcitx-0.5.6-3.13.aarch64.rpm"
RPM_HASH = "1ed28b377e85f8b5e114e8cb9ea01378a558d9cbb1a409e6f0d293d1a05a997799856d442797f289e6fdfca7b2a0554809b824005e4d4559d776a42d74f1b23b"

RPROVIDES:${PN} += "fcitx-config-kde5 \
fcitx-config-kf5 \
kf5-kcm-fcitx \
locale-plasma5-workspace-ko;zh-CN;zh-SG"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
fcitx-qt5 \
ld-linux-aarch64.so.1 \
libFcitxQt5DBusAddons.so.1 \
libFcitxQt5WidgetsAddons.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-core.so.0 \
libfcitx-utils.so.0 \
libm.so.6 \
libstdc++.so.6 \
libxkbfile.so.1 \
plasma5-workspace"

inherit rpm
