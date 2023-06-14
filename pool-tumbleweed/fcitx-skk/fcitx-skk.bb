SUMMARY = "Japanese SKK IME Wrapper for Fcitx"
DESCRIPTION = "fcitx-skk is an input method engine for Fcitx, which uses libskk as its backend."
LICENSE = "GPL-3.0+"

PV = "0.1.4"

RPM_NAME = "fcitx-skk-0.1.4-1.25.aarch64.rpm"
RPM_HASH = "42610942db09085038b0d654b36cb81ee9572d33dd97358c080887e305fc90e0eb915eace1d4eb9af66a3609d9eda195ba4a0d9fa257a6d03e1faa92f19bcddd"

RPROVIDES:${PN} += "fcitx-skk \
libfcitx-skk-config.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
libFcitxQt5WidgetsAddons.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-utils.so.0 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libskk.so.0 \
libstdc++.so.6"

inherit rpm
