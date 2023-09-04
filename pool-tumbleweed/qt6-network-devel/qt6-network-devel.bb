SUMMARY = "Development files for the Qt 6 Network library"
DESCRIPTION = "Development files for the Qt 6 Network library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-network-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "c5048cf1f6e9fa96c6a5f231c81be74252a00dbf4862cd4cc4e1a0d722ec3e341b1b96e301e9094f88cb3efce31851dab93aa03990701bedd8b4917b6e7e5e4b"

RPROVIDES:${PN} += "cmake-Qt6Network \
pkgconfig-Qt6Network \
qt6-network-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Network6 \
pkgconfig-Qt6Core"

inherit rpm
