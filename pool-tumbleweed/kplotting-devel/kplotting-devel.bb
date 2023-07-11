SUMMARY = "Build environment for the KDE data plotting library"
DESCRIPTION = "Development files for KPlotWidget, which is a QWidget-derived class \
that provides a virtual base class for data plotting."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kplotting-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "6d6970f21b6d86706bb01bbe0c6327c8a4711a01956a48762dd3591e417486bf1c93f1bfa853503c6df99cc8592858033e1801ecf92464c59f846279be9e6492"

RPROVIDES:${PN} += "cmake-KF5Plotting \
kplotting-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5Plotting.so.5 \
libKF5Plotting5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
