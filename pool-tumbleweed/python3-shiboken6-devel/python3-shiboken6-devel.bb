SUMMARY = "Development files for python3-shiboken6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "python3-shiboken6-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "613e3b88bfa4d3b5d723fdba025a5cdeaecde8461a7cf8cfe22fdd44a927fc46ce52db6515bbcd2c8a2eb1878a7a2a9f46b2e0cdeb390efdbdbf737a97964089"

RPROVIDES:${PN} += "cmake-Shiboken6 \
cmake-Shiboken6Tools \
pkgconfig-shiboken6 \
python3-shiboken6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python3-shiboken6"

inherit rpm
