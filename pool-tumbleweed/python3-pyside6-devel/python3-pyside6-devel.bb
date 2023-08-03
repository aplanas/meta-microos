SUMMARY = "Development files for python3-pyside6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "python3-pyside6-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "92f5eb1b2a35fc14f669d00b90b206efb23c7db95d371e52098986bff08e2178e87c9acb113d14d5febe3db6353e11a7d239cc8044fdaeaf0cd0c69539d87fcb"

RPROVIDES:${PN} += "cmake-PySide6 \
cmake-PySide6Qml \
pkgconfig-pyside6 \
python3-pyside6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-shiboken6 \
python3-pyside6"

inherit rpm
