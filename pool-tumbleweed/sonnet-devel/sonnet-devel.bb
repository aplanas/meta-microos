SUMMARY = "KDE spell checking library: Build Environment"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "sonnet-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "8e3026037b4436194077083ef71f15aab6bdb1b504b4665621d26ed0a3c95813e433def3a62babd7ca36e465ceceedb65981cf7c05289d1f42ad4730962dba56"

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
