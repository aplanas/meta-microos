SUMMARY = "Qt 6 LabsSharedImage library - Development files"
DESCRIPTION = "Development files for the Qt 6 LabsSharedImage library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssharedimage-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "8ad5a1c720e3897ab6696a58070c35c5a8defda05e2e3ea9ccf0e9149b134ab682d894b584242706452a9665d6cba72d98c7f29eb6284fc78fffe9451fcfa20b"

RPROVIDES:${PN} += "cmake-Qt6LabsSharedImage \
pkgconfig-Qt6LabsSharedImage \
qt6-labssharedimage-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6LabsSharedImage6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Quick \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-quick-private-devel"

inherit rpm
