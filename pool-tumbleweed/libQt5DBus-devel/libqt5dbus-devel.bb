SUMMARY = "Development files for the Qt5 D-Bus library"
DESCRIPTION = "Development files for the Qt5 D-Bus library. This package also \
contains Qt5's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5DBus-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "e394a1c6c8a0c70644d571d7ca2d834227cb37664214cd695de0a39c9a0a420ac54385a9b3108da8b996af38dbb44eb8e9eca6e08310d4660380f4e3219bcbd7"

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
