SUMMARY = "Development files for the Qt5 gamepad library"
DESCRIPTION = "You need this package if you want to compile programs with QtGamepad."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtgamepad-devel-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "69e6f1ff9df7561c3626c6152b10dee5efa0a05876bdf7864865430ad818c6de44c18431732c3e42fc23cbb669f2a393b05ba8c3d3629fcecb4386f0b38d702d"

RPROVIDES:${PN} += "cmake(Qt5Gamepad) \
libqt5-qtgamepad-devel \
libqt5-qtgamepad-devel(aarch-64) \
pkgconfig(Qt5Gamepad)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Gamepad5 \
pkgconfig(Qt5Core) \
pkgconfig(Qt5Gui)"

inherit rpm
