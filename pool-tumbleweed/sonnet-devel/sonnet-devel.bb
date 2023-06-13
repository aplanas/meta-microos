SUMMARY = "KDE spell checking library: Build Environment"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "sonnet-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "7088c316e3765cef9aeb463864667edb4d4bba4c8e6269fbe8ff6db0adfae53fb74b541ad6c50ff3e0a496c8d6554cc4ae62f8710234803d0f60a1af6e477195"

RPROVIDES:${PN} += "cmake(KF5Sonnet) \
sonnet-devel \
sonnet-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt5Core) \
extra-cmake-modules \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5SonnetCore5 \
libKF5SonnetUi.so.5()(64bit) \
libKF5SonnetUi5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
