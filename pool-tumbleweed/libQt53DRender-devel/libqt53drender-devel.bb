SUMMARY = "Development files for the Qt 5 Renderer 3D library"
DESCRIPTION = "Development files for the Qt 5 Renderer 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DRender-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "80bb8279b5323e7ce77ad037a0260823bb31422c7086df52fa03e71af908ba0e01de688c710fc56c2f37a02646a31da9526ef7129de698923513841bc4a9fb1f"

RPROVIDES:${PN} += "cmake-Qt53DRender \
libQt53DRender-devel \
libQt53DRenderer-devel \
pkgconfig-Qt53DRender"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuickScene2D5 \
libQt53DRender5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt5Core"

inherit rpm
