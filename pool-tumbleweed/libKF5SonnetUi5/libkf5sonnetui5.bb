SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5SonnetUi5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "350a430b85ec1251baa9fb745633fc28bc1fffd04b717e85df420d5a08fda26015eceba89c408fb9db8896a49882b1be75a433941f2fe48eaca67da7d3e949d6"

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
