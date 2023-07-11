SUMMARY = "Unikey engine support for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.0.11"

RPM_NAME = "fcitx5-unikey-5.0.11-2.4.aarch64.rpm"
RPM_HASH = "ea972d10d32245ebf48f50945a6beb0eef5842bd88af59c413659973a1979b7c6e06acdaff7e5d04737b58b4a8d7498c27271a86b1cb5fe5082f740908d26109"

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
