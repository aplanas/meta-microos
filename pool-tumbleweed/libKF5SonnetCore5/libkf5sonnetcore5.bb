SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5SonnetCore5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5d55d874d049ddf0bca2edd57aca3a71ac633bbefa937dd868199b613d64bde1a5b08f4df0309e8b0446c385f612675486be031da3e62b8fff4af03e0b8d4b31"

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
