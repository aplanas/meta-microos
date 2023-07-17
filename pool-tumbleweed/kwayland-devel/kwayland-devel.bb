SUMMARY = "KDE Wayland library: Build Environment"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kwayland-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "64a24747c7a82aa04e46afe6454d112bdd36811731774357b4572b8699a68671712c1e83d0c20f88578cd091c833cfb1107bbd5d1dfdb72e1f454f2fdbd6ad24"

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
