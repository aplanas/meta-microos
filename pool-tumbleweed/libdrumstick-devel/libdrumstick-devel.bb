SUMMARY = "Development package for the libdrumstick library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
libdrumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "libdrumstick-devel-2.7.2-1.4.aarch64.rpm"
RPM_HASH = "494d983594a6bb6347d24c64104478d42ab71195912ada3d1e74fcee0e75f08c9010a1f3e42fb309954c3e5ba127c2b198d216d4b34f6719ab6661cc4ca4e311"

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
