SUMMARY = "Fcitx5 Pinyin dictionary manager library"
DESCRIPTION = "Fcitx5 Pinyin dictionary manager library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-pinyindictmanager-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "2a0e1275249ad9a6007b1d418da01503d298532eaf2b651813644e2a9e287a19c91f7454259bfa57cf970cd8d8260aadd9824735f0b43cc542055b3400c5db63"

RPROVIDES:${PN} += "fcitx5-pinyindictmanager \
libpinyindictmanager.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Qt5WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
