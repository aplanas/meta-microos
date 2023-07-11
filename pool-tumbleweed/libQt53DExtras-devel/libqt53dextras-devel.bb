SUMMARY = "Development files for the Qt 5 3D Extras libary"
DESCRIPTION = "Development files for the Qt 5 3D Extras library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DExtras-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "6b0c97753def4d79ee44ff8a74a9907d9ef932b61e047b7a17b21481bf8f092287b715219215e51c4e40e35af2b97a0de8ab00d098845201b929f6d03bdeb78e"

RPROVIDES:${PN} += "cmake-Qt53DExtras \
libQt53DExtras-devel \
pkgconfig-Qt53DExtras"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DExtras5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DInput \
pkgconfig-Qt53DLogic \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
