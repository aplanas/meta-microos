SUMMARY = "Development files for the Qt 5 Sensors library"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libQt5Sensors5."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtsensors-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "24ee611d68dd87d20c36018b9a059edefd7d3dbd370e83664f6fe21bff75f60c334cd775b378f8b4ce8e74fbb9d45cf89af5f028e3ae5f20b3f0d9bf118f3d10"

RPROVIDES:${PN} += "cmake-Qt5Sensors \
libQt5Sensors-devel \
libqt5-qtsensors-devel \
pkgconfig-Qt5Sensors"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Sensors5 \
pkgconfig-Qt5Core"

inherit rpm
