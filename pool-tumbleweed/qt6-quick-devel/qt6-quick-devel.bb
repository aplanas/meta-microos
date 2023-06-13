SUMMARY = "Qt 6 Quick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quick-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "ffdaa0582d521771480246f03004e7373b88fb265e2b633b3da2d1635c697cfc632962c32a1b030be2f645a3e1cefcae035686b3b63219c9d5b8d94b7957c257"

RPROVIDES:${PN} += "cmake(Qt6Quick) \
pkgconfig(Qt6Quick) \
qt6-quick-devel \
qt6-quick-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Core) \
cmake(Qt6Gui) \
cmake(Qt6Network) \
cmake(Qt6OpenGL) \
cmake(Qt6Qml) \
cmake(Qt6QmlModels) \
libQt6Quick6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Gui) \
pkgconfig(Qt6OpenGL) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6QmlModels)"

inherit rpm
