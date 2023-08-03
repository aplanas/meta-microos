SUMMARY = "Qt 6 Positioning library - Development files"
DESCRIPTION = "Development files for the Qt 6 Positioning library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-positioning-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e34f897aa631ca137357eef63fcb202d757604cacdda46126aa472f58945d03b5dcfdd95d57582e15a15f709b4e4e6874803d73fd45dfb0e388467723456fd6a"

RPROVIDES:${PN} += "cmake-Qt6Positioning \
pkgconfig-Qt6Positioning \
qt6-positioning-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
libQt6Positioning6 \
pkgconfig-Qt6Core"

inherit rpm
