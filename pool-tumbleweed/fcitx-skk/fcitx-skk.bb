SUMMARY = "Japanese SKK IME Wrapper for Fcitx"
DESCRIPTION = "fcitx-skk is an input method engine for Fcitx, which uses libskk as its backend."
LICENSE = "GPL-3.0+"

PV = "0.1.4"

RPM_NAME = "fcitx-skk-0.1.4-1.25.aarch64.rpm"
RPM_HASH = "42610942db09085038b0d654b36cb81ee9572d33dd97358c080887e305fc90e0eb915eace1d4eb9af66a3609d9eda195ba4a0d9fa257a6d03e1faa92f19bcddd"

RPROVIDES:${PN} += "fcitx-skk \
fcitx-skk(aarch-64) \
libfcitx-skk-config.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
libFcitxQt5WidgetsAddons.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libfcitx-config.so.4()(64bit) \
libfcitx-utils.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libskk.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
