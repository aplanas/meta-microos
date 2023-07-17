SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "sonnet-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "6a83ed1fbc7d82a1e309ff663d13f600559daf9a528b221ee2f1579c4bbafc48a1fc3a76147571003e84a12ba66163fd5230d4356360a05d5a5cc99ccb2d1573"

RPROVIDES:${PN} += "sonnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
