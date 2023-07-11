SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "sonnet-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "cbdf3318c7d9a3bdf12b2e4b1834d7863b4788b7aa400e5613105fa2ef8105f59b14a49b8792da33a7a21d2c4fa618fc9fdf50334c2d1d2172227e17eb74cc06"

RPROVIDES:${PN} += "sonnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
