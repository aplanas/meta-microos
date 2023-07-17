SUMMARY = "Development files for the Qt5 core library"
DESCRIPTION = "Development files for the Qt5 core library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Core-devel-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "2a0ed5f6a723b012dcb2f967e92466dd0296064334dbc36b9358e095701c27b9036cc2cefc685448edea713a582ac4bd1069a5b1ef7281d2535f39f6c99556ea"

RPROVIDES:${PN} += "cmake-Qt5 \
cmake-Qt5Core \
libQt5Core-devel \
pkgconfig-Qt5Core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core5 \
libqt5-qtbase-common-devel"

inherit rpm
