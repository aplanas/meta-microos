SUMMARY = "Development files for the Qt5 gamepad library"
DESCRIPTION = "You need this package if you want to compile programs with QtGamepad."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtgamepad-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "9b80d5887335c56b73c46a93994493d152bc9084c17beae2d0fe750e5cb1995ea844ba5b1d38a459b84e0b55a19688c1f8e18eeae3b2f7376b1f829c70766f05"

RPROVIDES:${PN} += "cmake-Qt5Gamepad \
libqt5-qtgamepad-devel \
pkgconfig-Qt5Gamepad"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Gamepad5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
