SUMMARY = "Qt 6 Core 5 Compat library - Development files"
DESCRIPTION = "Development files for the Qt 6 Core 5 Compat library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "1f83b1ad5b03159adc4673988267ddf099313ec66633cf9cc342406894230d1ff8477e000014fb258d57d22435055a69a1df2507879174e6b939145c2ec86844"

RPROVIDES:${PN} += "cmake-Qt6Core5Compat \
pkgconfig-Qt6Core5Compat \
qt6-qt5compat-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Core5Compat6 \
pkgconfig-Qt6Core \
qt6-core-private-devel"

inherit rpm
