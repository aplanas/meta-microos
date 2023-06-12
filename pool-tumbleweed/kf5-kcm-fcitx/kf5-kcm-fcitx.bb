SUMMARY = "KF5 control module for Fcitx"
DESCRIPTION = "KF5 control module for Fcitx. \
 \
You can config fcitx through 'Configure Desktop' - 'Locale' - Fcitx now."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.6"

RPM_NAME = "kf5-kcm-fcitx-0.5.6-3.13.aarch64.rpm"
RPM_HASH = "1ed28b377e85f8b5e114e8cb9ea01378a558d9cbb1a409e6f0d293d1a05a997799856d442797f289e6fdfca7b2a0554809b824005e4d4559d776a42d74f1b23b"

RPROVIDES:${PN} += "application() \
application(kbd-layout-viewer.desktop) \
fcitx-config-kde5 \
fcitx-config-kf5 \
kf5-kcm-fcitx \
kf5-kcm-fcitx(aarch-64) \
locale(plasma5-workspace:ko;zh_CN;zh_SG)"
RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
fcitx-qt5 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFcitxQt5DBusAddons.so.1()(64bit) \
libFcitxQt5WidgetsAddons.so.1()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
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
libc.so.6(GLIBC_2.34)(64bit) \
libfcitx-config.so.4()(64bit) \
libfcitx-core.so.0()(64bit) \
libfcitx-utils.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libxkbfile.so.1()(64bit) \
plasma5-workspace"

inherit rpm
