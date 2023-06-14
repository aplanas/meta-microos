SUMMARY = "Development package for the libdrumstick library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
libdrumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-devel-2.7.2-1.3.aarch64.rpm"
RPM_HASH = "e2b991bcca5e2cb33ee20569a70d783413b52c41fb6578d78eb6c0c28b0b6d6627b95f50942c20ca43b38e02e9e7c411a2e4dfdc6ab1e6fb0b4a8b1c65deb2e8"

RPROVIDES:${PN} += "cmake-drumstick \
cmake-drumstick-alsa \
cmake-drumstick-file \
cmake-drumstick-rt \
cmake-drumstick-widgets \
libdrumstick-devel \
libdrumstick-vpiano-plugin.so \
pkgconfig-drumstick-alsa \
pkgconfig-drumstick-file \
pkgconfig-drumstick-rt \
pkgconfig-drumstick-widgets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
cmake-Qt5Core \
glibc-devel \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libdrumstick-alsa2 \
libdrumstick-file2 \
libdrumstick-rt2 \
libdrumstick-widgets.so.2 \
libdrumstick-widgets2 \
libgcc-s.so.1 \
libstdc++-devel \
libstdc++.so.6"

inherit rpm
