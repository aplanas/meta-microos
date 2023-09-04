SUMMARY = "KDE Wayland library: Build Environment"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kwayland-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "9d3e82d24383f8d64e45ec65bcdf3ec6324068dcae87ae558f117ec3a5c0c77ed53d947e7574551d02933f6b1f8258607925ea0be9eb61fa834a6f31e022d83a"

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
