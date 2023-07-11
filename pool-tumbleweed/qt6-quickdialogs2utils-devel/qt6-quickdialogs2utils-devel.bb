SUMMARY = "Qt6 QuickDialogs2Utils library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickDialogs2Utils library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickdialogs2utils-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "dfa66647fbf7a4f3c8c261c720897af906b7681e84364e44728befec45fe07889ad046159a8d1bb8e904df9bc9d8dd1b26a858272d5c0b5648ec4d27bc2e9679"

RPROVIDES:${PN} += "cmake-Qt6QuickDialogs2Utils \
pkgconfig-Qt6QuickDialogs2Utils \
qt6-quickdialogs2utils-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6QuickDialogs2Utils6 \
pkgconfig-Qt6Core \
qt6-gui-private-devel"

inherit rpm
