SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5SonnetCore5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "a3efe5de2e30c03450b8b80a64260c14fd94b08eade9d8796cc9a8019bc6bdd194e8a4d147dd6c02c717c0033bf04d197447cbe6fb75e387897a4350ac3a89c4"

RPROVIDES:${PN} += "libKF5SonnetCore.so.5()(64bit) \
libKF5SonnetCore5 \
libKF5SonnetCore5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
sonnet"

inherit rpm
