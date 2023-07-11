SUMMARY = "Icon GUI utilities: Build Environment"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kiconthemes-devel-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "d5e22a1fece21b5545f56ab1804c56331f89c3100d2435bacc58037efd13e01bc5bd164c12a8532e257c4e15ead20ddc8264676e237bd18187fe3f4730f9568b"

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
