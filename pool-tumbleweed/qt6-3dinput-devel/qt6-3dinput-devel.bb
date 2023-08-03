SUMMARY = "Development files for the Qt 6 3DInput library"
DESCRIPTION = "Development files for the Qt 6 3DInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dinput-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "19dbdc60359126c5745c502ba99fdbd430f065960111fef6ff63b6e2bbde33ed50c6172584c673e4073cb969eece8eb987c87c5a9d2d33945b8d393da10ad082"

RPROVIDES:${PN} += "cmake-Qt63DInput \
pkgconfig-Qt63DInput \
qt6-3dinput-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt63DCore \
cmake-Qt6Gui \
libQt63DInput6 \
pkgconfig-Qt63DCore \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui"

inherit rpm
