SUMMARY = "KF5 control module for Fcitx"
DESCRIPTION = "KF5 control module for Fcitx. \
 \
You can config fcitx through 'Configure Desktop' - 'Locale' - Fcitx now."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.6"

RPM_NAME = "kf5-kcm-fcitx-0.5.6-3.14.aarch64.rpm"
RPM_HASH = "99e4ba9b4fd8cb44cc4306c6e9630e28ffbfe65b5d0d9535063e09876b080e715472144baeadfb85dee631a44a9646365c76bedaeca3bf7dc4e98e06fbca4738"

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
