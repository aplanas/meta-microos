SUMMARY = "Development files for the Qt5 widgets library"
DESCRIPTION = "Development files for the Qt5 widgets library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Widgets-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "955cc22899c5b066c8d587f6e77a1ac22925c9cb7e4c46ee42fe6f86fbd9077e0e07144a13c8086d74d82c312689657398efd01b77d42dcc82daac3f6a604b50"

RPROVIDES:${PN} += "cmake-Qt5Widgets \
libQt5Widgets-devel \
pkgconfig-Qt5Widgets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core-devel \
libQt5Gui-devel \
libQt5Widgets5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui"

inherit rpm
