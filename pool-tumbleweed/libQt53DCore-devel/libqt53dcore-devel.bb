SUMMARY = "Development files for the Qt 5 Core 3D library"
DESCRIPTION = "Development files for the Qt 5 Core 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DCore-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "2cd8b86291a2c6aff7f86a8a21a3b72133e0d85e67ba1096a5b3241a1c4ce7a949a3eb584846056a3ac81ae5d23d58d071620094dbd4cd3699b453c74b66c0fa"

RPROVIDES:${PN} += "cmake-Qt53DCore \
libQt53DCore-devel \
pkgconfig-Qt53DCore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DCore5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Network"

inherit rpm
