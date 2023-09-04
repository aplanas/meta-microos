SUMMARY = "Header Files for PySide2"
DESCRIPTION = "Files needed for development with the PySide2 bindings \
for Qt."
LICENSE = "(GPL-2.0-only & (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0) | LGPL-3.0-only"

PV = "5.15.10"

RPM_NAME = "python3-pyside2-devel-5.15.10-2.1.aarch64.rpm"
RPM_HASH = "996e51e626833064f4b83fca1b897f33c92e06247f449e394d07f9a96b3c5a248e3c9670621c3085a6c5763d0d267427f754693f0a73f9c28e3d6882bbba2780"

RPROVIDES:${PN} += "cmake-PySide2 \
cmake-Shiboken2 \
pkgconfig-pyside2 \
pkgconfig-shiboken2 \
python3-pyside2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-shiboken2 \
python3-pyside2"

inherit rpm
