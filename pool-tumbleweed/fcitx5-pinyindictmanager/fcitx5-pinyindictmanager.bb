SUMMARY = "Fcitx5 Pinyin dictionary manager library"
DESCRIPTION = "Fcitx5 Pinyin dictionary manager library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.0.17"

RPM_NAME = "fcitx5-pinyindictmanager-5.0.17-1.1.aarch64.rpm"
RPM_HASH = "0447901f86bde39d1ec0d66c64696dbdb3f601982416a4e1752468415fadf3cb0f92cc83880fcab0260e268e624a2043c1767e2f684d8a1706a461a33aaa62be"

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
