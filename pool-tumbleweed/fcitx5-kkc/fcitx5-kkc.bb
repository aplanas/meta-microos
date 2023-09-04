SUMMARY = "Libkkc input method support for Fcitx5"
DESCRIPTION = "This package provides libkkc input method support for Fcitx5."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-kkc-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "561761f4f9991d0bac813d57168acb247aed52728e1e476698626532f31b37f2fa496fa47be736ffa3893ffd0ad11918f087cd545ce3096f60d659a6e7fbc0cc"

RPROVIDES:${PN} += "fcitx-kkc \
fcitx5-kkc \
libfcitx5-kkc-config.so"

RDEPENDS:${PN} += "fcitx5 \
kkc-data \
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
libkkc.so.2 \
libstdc++.so.6"

inherit rpm
