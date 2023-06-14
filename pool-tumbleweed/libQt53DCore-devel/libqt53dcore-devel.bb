SUMMARY = "Development files for the Qt 5 Core 3D library"
DESCRIPTION = "Development files for the Qt 5 Core 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DCore-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "0868f1b8789240d5080fe0c0da3dc15680d3f16e2b38d40828afcf63c49c0bd938ebb2d8fea6ca47d8ddc9d5a023b742f9a8050473f7abb8346279bdd77eebcb"

RPROVIDES:${PN} += "cmake-Qt53DCore \
libQt53DCore-devel \
pkgconfig-Qt53DCore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DCore5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Network"

inherit rpm
