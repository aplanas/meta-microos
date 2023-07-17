SUMMARY = "Development files for the Qt5 D-Bus library"
DESCRIPTION = "Development files for the Qt5 D-Bus library. This package also \
contains Qt5's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5DBus-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "fe661e5e94e55a03844a6df730cf6a4a5f35b4dbbd0a03a4d7f0a33cb68852e4f007e02f5b275ed905b83ba5966f980e7bbef0c978c7ace11778a4687bce76b7"

RPROVIDES:${PN} += "cmake-Qt5DBus \
libQt5DBus-devel \
pkgconfig-Qt5DBus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libQt5Core-devel \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libc.so.6 \
libstdc++.so.6 \
pkgconfig-Qt5Core"

inherit rpm
