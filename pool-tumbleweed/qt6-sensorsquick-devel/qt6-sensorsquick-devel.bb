SUMMARY = "Qt 6 SensorsQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 SensorsQuick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-sensorsquick-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6ebc774ab27eed67e6257377e691018cafb72f663b6d6f7f21c81ef69a7395922615b36d794de13a044c98d9dfd973e4bf32f3dba41412667055ef6fbf08920f"

RPROVIDES:${PN} += "cmake(Qt6SensorsQuick) \
pkgconfig(Qt6SensorsQuick) \
qt6-sensorsquick-devel \
qt6-sensorsquick-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Qml) \
cmake(Qt6Sensors) \
libQt6SensorsQuick6 \
pkgconfig(Qt6Core) \
pkgconfig(Qt6Qml) \
pkgconfig(Qt6Sensors)"

inherit rpm
