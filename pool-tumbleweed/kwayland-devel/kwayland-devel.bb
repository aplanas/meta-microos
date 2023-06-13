SUMMARY = "KDE Wayland library: Build Environment"
DESCRIPTION = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kwayland-devel-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "3b95fa16b8254dcbc6bf15abdec1fca42fc6a4eaabb7a4d95f002b9123b6949ec5454790e3dc4876f13fbe34e8ff48536aae14829dfa572352f06c91232ac494"

RPROVIDES:${PN} += "cmake(KF5Wayland) \
kwayland-devel \
kwayland-devel(aarch-64) \
pkgconfig(KF5WaylandClient)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt5Gui) \
extra-cmake-modules \
kwayland \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5WaylandServer.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
pkgconfig(Qt5Gui)"

inherit rpm
