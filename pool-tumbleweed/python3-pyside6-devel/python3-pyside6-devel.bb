SUMMARY = "Development files for python3-pyside6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "python3-pyside6-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "d96ce74b5652615b017a77268fbfae01e2f9e7223c73d41e504c6f2c8a8ad5112bda08dc9b769b8e3569ecd61aa6d5d36ab2fe1224d9cc848d92515161e36aee"

RPROVIDES:${PN} += "cmake-PySide6 \
cmake-PySide6Qml \
pkgconfig-pyside6 \
python3-pyside6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-shiboken6 \
python3-pyside6"

inherit rpm
