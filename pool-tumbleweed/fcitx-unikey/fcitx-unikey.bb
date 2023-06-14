SUMMARY = "Vietnamese unikey support for Fcitx"
DESCRIPTION = "fcitx-unikey provides support for Vietnamese unikey IM."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.7"

RPM_NAME = "fcitx-unikey-0.2.7-4.7.aarch64.rpm"
RPM_HASH = "8b0a2fcfa39579e9d805deb9c3b0b783f2020a09718c6b0693481f2de53021dfd866da61c73e3f87c7d2a7e8488700ca44be0b0999d4bc20a5de2f47371f0453"

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
