SUMMARY = "Qt 6 Core development utilities"
DESCRIPTION = "Qt 6 Core development utilities. \
It contains the qtbase utilities and definitions."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-base-common-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "9ff746d21063fb479c3b709abdd73387db6be69abd2812bd1bd4e4e8aa14570eee7249942ae33c4ca44d2188c2d022d4ee19565d2e850fe73b89b6297f299fe2"

RPROVIDES:${PN} += "cmake-Qt6 \
cmake-Qt6BuildInternals \
cmake-Qt6HostInfo \
pkgconfig-Qt6Platform \
qt6-base-common-devel \
qt6-tools-qtpaths"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/sh \
cmake \
gcc-c++ \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpcre2-16.so.0 \
libstdc++.so.6 \
libzstd.so.1 \
pkgconfig \
qt6-macros"

inherit rpm
