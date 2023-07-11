SUMMARY = "Development files for the Qt5 X11 Extras library"
DESCRIPTION = "You need this package if you want to compile programs with qtx11extras."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtx11extras-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "86824343b895b53304d2f8000f9493a61701213a63dd0c38adb845b3c85cf2c0c0bbf65335454145fc8f254e87937b238d1289bd8c383e6251989086c3a13886"

RPROVIDES:${PN} += "cmake-Qt5X11Extras \
libQt5X11Extras-devel \
libqt5-qtx11extras-devel \
pkgconfig-Qt5X11Extras"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5X11Extras5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
