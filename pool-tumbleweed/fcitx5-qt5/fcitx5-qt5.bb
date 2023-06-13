SUMMARY = "Qt5 IM module for Fcitx5"
DESCRIPTION = "Qt5 IM module for Fcitx5."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-qt5-5.0.17-1.2.aarch64.rpm"
RPM_HASH = "8fbe25aa5b7fa114505fc38885fa049d2aba73933d2e3aa7315e2e837846fe91efbf28c44e78b10dacf946e9eeb9bdf0886cca2985b2300da5327bd3115b2145"

RPROVIDES:${PN} += "application() \
application(org.fcitx.fcitx5-qt5-gui-wrapper.desktop) \
fcitx-qt5 \
fcitx5-qt5 \
fcitx5-qt5(aarch-64) \
libfcitx-quickphrase-editor5.so()(64bit) \
libfcitx5platforminputcontextplugin.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFcitx5Qt5DBusAddons.so.1()(64bit) \
libFcitx5Qt5WidgetsAddons.so.2()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon.so.0()(64bit)"

inherit rpm
