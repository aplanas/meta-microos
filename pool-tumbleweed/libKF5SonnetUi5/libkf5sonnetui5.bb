SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5SonnetUi5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "17d083fcaf645bc26a64674ed0b2dc2417aa39969bc0db542272a8b3074986e10275a8fa73e0059f86a9595c49f59dd20ac26df2f3652201e5ae7703597aa4c8"

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
