SUMMARY = "Qt 6 Core development utilities"
DESCRIPTION = "Qt 6 Core development utilities. \
It contains the qtbase utilities and definitions."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-common-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "d03ed6aac42038f7555ed71dc2645c50736d1e4b2f04a996e7717370cb91020edc7a8d431ad89450b7ed1e6f74d6f8902626abd27f445b26cc2ebefb91809822"

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
