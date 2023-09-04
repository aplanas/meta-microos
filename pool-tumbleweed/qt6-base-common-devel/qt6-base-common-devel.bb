SUMMARY = "Qt 6 Core development utilities"
DESCRIPTION = "Qt 6 Core development utilities. \
It contains the qtbase utilities and definitions."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-base-common-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "2300188c124ad9ba11c0f8471786833a2ea7141d9dfefdc066a52266d5b415cef99ed71715e3da4ce39955ab1e002a9d129a57856fa2a213d960bf5e28dc3422"

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
