SUMMARY = "Development files for the Qt 5 3D Quick Animation library"
DESCRIPTION = "Development files for the Qt 5 3D Quick Animation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuickAnimation-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "800e4a465d3a2146bd25149009ff368f3a2b501899dced770f34341d433545d12b4db643af378f1c714a3c8d0a5e17c299eb0c9715f48a7a94a4a87b0b9f3075"

RPROVIDES:${PN} += "cmake-Qt53DQuickAnimation \
libQt53DQuickAnimation-devel \
pkgconfig-Qt53DQuickAnimation"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickAnimation5 \
pkgconfig-Qt53DAnimation \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DQuick \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml"

inherit rpm
