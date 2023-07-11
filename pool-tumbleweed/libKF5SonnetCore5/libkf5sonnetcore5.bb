SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5SonnetCore5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "bfd58fafd29d0907447a1c05ae7d4a035fe0a5781e64276df0a20dac584b765aa2f3159a767a0c0314f0f000f96dc78dc1951dfbd6bd036aa0a1f13a7816d317"

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
