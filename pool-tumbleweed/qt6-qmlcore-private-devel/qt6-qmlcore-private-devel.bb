SUMMARY = "Non-ABI stable API for the Qt 6 QmlCore library"
DESCRIPTION = "This package provides private headers of libQt6QmlCore that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmlcore-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "7c238a0c8efec4d8770eefd2b5759beb788efe25f56366b7a6297b4163f10dee78b6416ca30c1c9df4dd97ba913b8e40b3c5c32627da3a2c5f43a8f685a0bf49"

RPROVIDES:${PN} += "qt6-qmlcore-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlCore"

inherit rpm
