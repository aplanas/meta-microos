SUMMARY = "Icon GUI utilities: Build Environment"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kiconthemes-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "8b3836f432a6c3f009174ce639246eda1239f792d8cf97cf531366913a29ccadbcd8862a86804460e68f274236bdb8b9a1c6e7679de0b3ba0c9ec8ef4484ce12"

RPROVIDES:${PN} += "cmake-KF5IconThemes \
kiconthemes-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5IconThemes.so.5 \
libKF5IconThemes5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
