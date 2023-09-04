SUMMARY = "Unikey engine support for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-unikey-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "ceb2d031f66f515ee00c364eaf234b536af8dc4f74e13f4ef4ec2d9e2373e3a966da06c15628426973794520e57e759ef12a477007ad33790c7e64231268d271"

RPROVIDES:${PN} += "fcitx-unikey \
fcitx5-unikey \
libfcitx5-unikey-keymap-editor.so \
libfcitx5-unikey-macro-editor.so \
libunikey.so"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
