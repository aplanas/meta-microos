SUMMARY = "Development files for the Qt 6 Pdf library"
DESCRIPTION = "Development files for the Qt 6 Pdf library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-pdf-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "c18b9b55fbebcea4fb7653819f74310dcc8cc90af66c887502b4d6050e3e2598c59e398d91355f32682e463380e80d03818b5e368c1d8b08b10ea320f2dbd2ef"

RPROVIDES:${PN} += "cmake-Qt6Pdf \
pkgconfig-Qt6Pdf \
qt6-pdf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Network \
libQt6Pdf6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
