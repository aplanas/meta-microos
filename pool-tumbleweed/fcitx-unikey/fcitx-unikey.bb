SUMMARY = "Vietnamese unikey support for Fcitx"
DESCRIPTION = "fcitx-unikey provides support for Vietnamese unikey IM."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.7"

RPM_NAME = "fcitx-unikey-0.2.7-4.7.aarch64.rpm"
RPM_HASH = "8b0a2fcfa39579e9d805deb9c3b0b783f2020a09718c6b0693481f2de53021dfd866da61c73e3f87c7d2a7e8488700ca44be0b0999d4bc20a5de2f47371f0453"

RPROVIDES:${PN} += "fcitx-unikey \
fcitx-unikey(aarch-64) \
libfcitx-unikey-macro-editor.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
ld-linux-aarch64.so.1()(64bit) \
libFcitxQt5WidgetsAddons.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libfcitx-config.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
