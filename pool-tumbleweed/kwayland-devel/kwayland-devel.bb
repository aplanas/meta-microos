SUMMARY = "KDE Wayland library: Build Environment"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kwayland-devel-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "3b95fa16b8254dcbc6bf15abdec1fca42fc6a4eaabb7a4d95f002b9123b6949ec5454790e3dc4876f13fbe34e8ff48536aae14829dfa572352f06c91232ac494"

RPROVIDES:${PN} += "cmake-KF5Wayland \
kwayland-devel \
pkgconfig-KF5WaylandClient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Gui \
extra-cmake-modules \
kwayland \
ld-linux-aarch64.so.1 \
libKF5WaylandServer.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6 \
pkgconfig-Qt5Gui"

inherit rpm
