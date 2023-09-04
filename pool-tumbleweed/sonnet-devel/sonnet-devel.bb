SUMMARY = "KDE spell checking library: Build Environment"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "sonnet-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "7ede4af2b31899c7c3e4a426121847fe0b9e9da2e11a43b979dcc70d0dfcbbbeea563e9029e304d40a6a1af054818c0863861580e13fbe101abfc207a5b96833"

RPROVIDES:${PN} += "cmake-KF5Sonnet \
sonnet-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5SonnetCore5 \
libKF5SonnetUi.so.5 \
libKF5SonnetUi5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
