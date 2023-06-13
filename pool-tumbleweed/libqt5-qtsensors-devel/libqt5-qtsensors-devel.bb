SUMMARY = "Development files for the Qt 5 Sensors library"
DESCRIPTION = "The Qt Sensors API provides access to sensor hardware via QML and C++ \
interfaces. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libQt5Sensors5."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtsensors-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "208c65ccbd00962f80c5e86596a4f4d62365a991dded7a86de105adcf11a37c8a604839fe575274b425b1d5b144c4e330b69d2ec9ff2fe8665c9efa0e3ce14a6"

RPROVIDES:${PN} += "cmake(Qt5Sensors) \
libQt5Sensors-devel \
libqt5-qtsensors-devel \
libqt5-qtsensors-devel(aarch-64) \
pkgconfig(Qt5Sensors)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Sensors5 \
pkgconfig(Qt5Core)"

inherit rpm
