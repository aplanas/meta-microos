SUMMARY = "Development files for the Qt 6 3DLogic library"
DESCRIPTION = "Development files for the Qt 6 3DLogic library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dlogic-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "a7b470eb314d7f664d5b0abba891b74bd9f657bf25763d31daafba4af82369d46c309eb7c7031a85b5e95af5ad3ae44c91573caf30fc33092d70f9fb0b385e0f"

RPROVIDES:${PN} += "cmake-Qt63DLogic \
pkgconfig-Qt63DLogic \
qt6-3dlogic-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Gui \
libQt63DLogic6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
