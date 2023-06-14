SUMMARY = "Unikey engine support for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.0.11"

RPM_NAME = "fcitx5-unikey-5.0.11-2.3.aarch64.rpm"
RPM_HASH = "1cfbc35b86ffdaa4807b14b8b9098e4033ff6c974e4f56913700543e7eef5b4ddd2ef524db49ac92cdb74c3243d67fd7d4c6f7ce34a3a988f192acc745f5c3b5"

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
