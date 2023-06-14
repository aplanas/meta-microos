SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "sonnet-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "3f101620c96d99ebb1e5df081bcd177df8b93b8b4391ef7bd9d885c4e9cc3a4660b6dfda58a0ae46c7f7f2cf970907d412cf38ae83b7e81de4a9472d5cc2ba1e"

RPROVIDES:${PN} += "sonnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
