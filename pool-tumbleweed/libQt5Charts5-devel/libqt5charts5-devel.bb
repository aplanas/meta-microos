SUMMARY = "Development files for the Qt 5 Charts Library"
DESCRIPTION = "This package provides header files and shared libraries for development with \
Qt Charts."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libQt5Charts5-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "9f177c857a35c91d0d1c6670dad1367c1b31f66266dbb17eec4e9f8770fa149134f1c72694d9e689699f96ce77fe741c055fc8f06241766ecaa0cf7252b2d38c"

RPROVIDES:${PN} += "cmake-Qt5Charts \
libQt5Charts5-devel \
pkgconfig-Qt5Charts"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Charts5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Widgets"

inherit rpm
