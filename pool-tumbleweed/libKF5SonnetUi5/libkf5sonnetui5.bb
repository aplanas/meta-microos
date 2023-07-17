SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5SonnetUi5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "cb2cc28fe977df80b9cef87c108b8dfac3e77fae392ef3a9e51c7daeea9a153a146f13b640c72986642185727554a5f4685bf8b8195e02d2f34af448e9245297"

RPROVIDES:${PN} += "libKF5SonnetUi.so.5 \
libKF5SonnetUi5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
