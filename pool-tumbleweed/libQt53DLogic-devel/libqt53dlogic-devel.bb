SUMMARY = "Development files for the Qt 5 Logic 3D library"
DESCRIPTION = "Development files for the Qt 5 Logic 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DLogic-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "c807b421ee6fb74b38cef3833cf350771e8df9c6bafe59cf4af843b6d103c862cc68078e06e004e7f15443e252f3e21d554fe16aa25cd5ab314de5e41856efe8"

RPROVIDES:${PN} += "cmake(Qt53DLogic) \
libQt53DLogic-devel \
libQt53DLogic-devel(aarch-64) \
pkgconfig(Qt53DLogic)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DLogic5 \
pkgconfig(Qt53DCore) \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui)"

inherit rpm
