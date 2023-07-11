SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with qtquickcontrols2."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde6"

RPM_NAME = "libQt5QuickControls2-devel-5.15.10+kde6-1.1.aarch64.rpm"
RPM_HASH = "cc58ddcba5cf6172d52f0bab3553b83d4be9c2d7c7c8adf3d86de8cbc694721bd620cb516b70b3bd13f8e361ca4824ccaf91c25d7a521f841b6afe227d400589"

RPROVIDES:${PN} += "cmake-Qt5QuickControls2 \
libQt5QuickControls2-devel \
pkgconfig-Qt5QuickControls2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5QuickControls2-5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Quick"

inherit rpm
