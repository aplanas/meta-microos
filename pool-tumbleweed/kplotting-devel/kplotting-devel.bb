SUMMARY = "Build environment for the KDE data plotting library"
DESCRIPTION = "Development files for KPlotWidget, which is a QWidget-derived class \
that provides a virtual base class for data plotting."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kplotting-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "f15ce4d2110cd1741163c0e6fbc1f8184253e9276cbaddaef0595f4eb2294396b62c1abe2914507dab9ac9429b9bab29ec910d66ad0519d89cde944dc9633fba"

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
