SUMMARY = "Development files for the Qt 5 Renderer 3D library"
DESCRIPTION = "Development files for the Qt 5 Renderer 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DRender-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "6cf6315e51f5aa4d7290e2d097db3118595c6a53f1acc45d3bb82a62dc928fe862af6414b145debfc53f2749b8c2febde2eb946c7ebd53455137e2e0ee2a993f"

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
