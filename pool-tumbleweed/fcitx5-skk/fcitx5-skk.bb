SUMMARY = "Libskk input method engine for Fcitx5"
DESCRIPTION = "fcitx-skk is an input method engine for Fcitx, which uses libskk as its backend."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-skk-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "0f8e80256d6f581c6bc7a756804613cbf8801c190271fab4841437962b4da7a73a7e19e400629c524bd39bb8901f9e10568c5b423238709f749f1a350c003c6e"

RPROVIDES:${PN} += "fcitx-skk \
fcitx5-skk \
libfcitx5-skk-config.so"

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
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libskk.so.0 \
libstdc++.so.6"

inherit rpm
