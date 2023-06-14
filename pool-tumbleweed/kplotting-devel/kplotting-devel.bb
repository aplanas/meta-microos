SUMMARY = "Build environment for the KDE data plotting library"
DESCRIPTION = "Development files for KPlotWidget, which is a QWidget-derived class \
that provides a virtual base class for data plotting."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kplotting-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "daee4382879e20bd74161482dc24bcac6e543c0a4ac80d80bbb90a39f86b41c7c97f31a134326ef216f3788b17d07af266df4f9474a9f0c467849215fcc7f39d"

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
