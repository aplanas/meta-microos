SUMMARY = "Header Files for PySide2"
DESCRIPTION = "Files needed for development with the PySide2 bindings \
for Qt."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9"

RPM_NAME = "python3-pyside2-devel-5.15.9-1.2.aarch64.rpm"
RPM_HASH = "41f8fee48fc3afb3f00f319a0aa9fb93df5c3e439c1a9b232eb7498b0ca37c16b88d4917183ed191565dc366a2dfef0557dcb1698c103c73d2ab3dca03f76f90"

RPROVIDES:${PN} += "cmake-PySide2 \
cmake-Shiboken2 \
pkgconfig-pyside2 \
pkgconfig-shiboken2 \
python3-pyside2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-shiboken2 \
python3-pyside2"

inherit rpm
