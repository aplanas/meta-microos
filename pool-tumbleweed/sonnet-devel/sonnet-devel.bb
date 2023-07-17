SUMMARY = "KDE spell checking library: Build Environment"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "sonnet-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "c3645f03abff49c905b3026c5e4b15a99beb502231691d8696c63cbba7ed86aef16fe54f6f439416dd45d0076b6e1910107166baf5212d5698c763be01118809"

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
