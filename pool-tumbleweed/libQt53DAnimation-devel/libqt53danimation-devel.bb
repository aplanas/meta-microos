SUMMARY = "Development files for the Qt 5 3D Animation library"
DESCRIPTION = "Development files for the Qt 5 3D Animation library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DAnimation-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "7002eed81cfe2b079527990a58019fe058c0debf514202a501c6f316782e2b6a0a55b5ded0e3509ed72dd1a4590aa883de89c753a2fe8b108422c64ae1864eb2"

RPROVIDES:${PN} += "cmake-Qt53DAnimation \
libQt53DAnimation-devel \
pkgconfig-Qt53DAnimation"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DAnimation5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt53DRender \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
