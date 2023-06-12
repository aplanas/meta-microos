SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5SonnetUi5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "53629621eeb3cfd16e9cd0cde56d97ac6d7bd1c3f360e0c8616af4e44f99df08c56deb7e907a2ea9a50acbac51a4959bd5a03e2ac90a423818f042122c0066eb"

RPROVIDES:${PN} += "libKF5SonnetUi.so.5()(64bit) \
libKF5SonnetUi5 \
libKF5SonnetUi5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5SonnetCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui5 \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Widgets5 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
