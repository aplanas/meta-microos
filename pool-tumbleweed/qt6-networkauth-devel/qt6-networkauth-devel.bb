SUMMARY = "Qt 6 NetworkAuth library - Development files"
DESCRIPTION = "Development files for the Qt 6 NetworkAuth library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-networkauth-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "796991b193628c55be18a9613c115d5a9f2c19e7a9963175ee2ea6600c7daf3e902b9fb0456e0344d4e39f0b320a7838d469e3aa666c68dbee4a176e778ac7a4"

RPROVIDES:${PN} += "cmake-Qt6NetworkAuth \
pkgconfig-Qt6NetworkAuth \
qt6-networkauth-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6NetworkAuth6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
