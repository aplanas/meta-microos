SUMMARY = "Qt6 QuickDialogs2Utils library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Utils library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2utils-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "1a687b38ac010f468b758be1232253452ae8a1f85d0e559bde985324849e73f807ce3d5b576f6c29d24da91136759d5d2014190651d00c5ca096820ef4466a1c"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2Utils \
pkgconfig-Qt6QuickDialogs2Utils \
qt6-quickdialogs2utils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6QuickDialogs2Utils6 \
pkgconfig-Qt6Core \
qt6-gui-private-devel"

inherit rpm
