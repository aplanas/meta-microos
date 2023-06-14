SUMMARY = "Qt 6 Core development utilities"
DESCRIPTION = "Qt 6 Core development utilities. \
It contains the qtbase utilities and definitions."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-common-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3247f2427331fc09bb11f10e5087b1ca0b3bcd469eadf4002819e5754a39fbb172b7c2742d47e6cdb07aff08a5e801805c57ba9dc454aec5b3a3638f1eeea036"

RPROVIDES:${PN} += "cmake-Qt6 \
cmake-Qt6BuildInternals \
cmake-Qt6HostInfo \
pkgconfig-Qt6Platform \
qt6-base-common-devel \
qt6-tools-qtpaths"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/pkg-config \
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
