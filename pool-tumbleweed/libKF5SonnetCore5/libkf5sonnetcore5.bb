SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5SonnetCore5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "4d617013dcdfb908ab0596ad366666d9c35f5e1117e01eb986cd6da51a76fcfe1877ca96e13d3ec0f7841c1f2362e6b3824db826cf65982bd35c248e3401069c"

RPROVIDES:${PN} += "libKF5SonnetCore.so.5 \
libKF5SonnetCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6 \
sonnet"

inherit rpm
