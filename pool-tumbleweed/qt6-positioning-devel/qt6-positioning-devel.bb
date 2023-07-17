SUMMARY = "Qt 6 Positioning library - Development files"
DESCRIPTION = "Development files for the Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0535141e0f8ade95e1720d92aaf1214b808682a962b0bed746fbfeaa046d32644ebd1899978f518104978818e297bef0262b53681273d3b1a95838b812138e87"

RPROVIDES:${PN} += "cmake-Qt6Positioning \
pkgconfig-Qt6Positioning \
qt6-positioning-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Positioning6 \
pkgconfig-Qt6Core"

inherit rpm
