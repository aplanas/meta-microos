SUMMARY = "Header Files for PySide2"
DESCRIPTION = "Files needed for development with the PySide2 bindings \
for Qt."
LICENSE = "(GPL-2.0-only & (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0) | LGPL-3.0-only"

PV = "5.15.10"

RPM_NAME = "python3-pyside2-devel-5.15.10-1.1.aarch64.rpm"
RPM_HASH = "4cd7413c1439335a98cc9a2882a26199eb2a9a4e3f50d3fcb4ad62fe65745b12f4dbd43f0d74d81d91e57b9e0232e89a8c32c8e9ac54e79a2a8f41d05ea7a57a"

RPROVIDES:${PN} += "cmake-PySide2 \
cmake-Shiboken2 \
pkgconfig-pyside2 \
pkgconfig-shiboken2 \
python3-pyside2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-shiboken2 \
python3-pyside2"

inherit rpm
