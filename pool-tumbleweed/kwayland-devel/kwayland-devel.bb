SUMMARY = "KDE Wayland library: Build Environment"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kwayland-devel-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "f7a6ffa88ae8d75bca977cdda90530580a066a4d80ace2268bb4401aa341b838f18b9c953431a9e3b1b651d6afadebc48908995b0bfabbc02305d7f1f2c6522f"

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
