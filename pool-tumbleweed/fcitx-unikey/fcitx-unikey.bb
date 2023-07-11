SUMMARY = "Vietnamese unikey support for Fcitx"
DESCRIPTION = "fcitx-unikey provides support for Vietnamese unikey IM."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.7"

RPM_NAME = "fcitx-unikey-0.2.7-4.8.aarch64.rpm"
RPM_HASH = "8766d125043e863e8a7cba1beb6ad8e0eae6ee91ff882814cc5ce09ca2d312eee6a930d23a3915187f039108981a3f3616dd42f46343fb6fcbf2cbb0841aa075"

RPROVIDES:${PN} += "fcitx-unikey \
libfcitx-unikey-macro-editor.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
ld-linux-aarch64.so.1 \
libFcitxQt5WidgetsAddons.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfcitx-config.so.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
