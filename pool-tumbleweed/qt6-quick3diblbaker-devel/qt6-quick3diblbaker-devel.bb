SUMMARY = "Qt6 Quick3DIblBaker library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DIblBaker library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3diblbaker-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "33821a3d151df77d5eb04e7b23c7d9102dd3299615a003ea2ebf085b9e9d677b21acd0308b6ec10cf3f33d86058b3a1024af6d371ee474e26131d4f73f2210c9"

RPROVIDES:${PN} += "cmake-Qt6Quick3DIblBaker \
pkgconfig-Qt6Quick3DIblBaker \
qt6-quick3diblbaker-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Quick \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3DIblBaker6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3DRuntimeRender"

inherit rpm
