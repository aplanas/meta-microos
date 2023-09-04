SUMMARY = "Icon GUI utilities: Build Environment"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kiconthemes-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "449871a8f713593b6aea5bbadc93062e3dae061f8c1776dda63fb47f6c6ca098903bffb1b0d18e4c36e3b9ce8bbf0fd883f71efeba08506db968f7d22097e8b8"

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
