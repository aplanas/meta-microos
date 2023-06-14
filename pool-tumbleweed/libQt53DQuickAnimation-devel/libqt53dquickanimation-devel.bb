SUMMARY = "Development files for the Qt 5 3D Quick Animation library"
DESCRIPTION = "Development files for the Qt 5 3D Quick Animation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuickAnimation-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "18e060bba66e040ba78b9f92ba69e55eff989e1274d28bb45118bf8d142a1c895f1726886dd0a74717f6734cb6911e5bc2dc08807dd09a1930bf88a008a24771"

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
