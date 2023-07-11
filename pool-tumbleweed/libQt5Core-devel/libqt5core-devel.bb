SUMMARY = "Development files for the Qt5 core library"
DESCRIPTION = "Development files for the Qt5 core library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Core-devel-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "cd092902ed8c402e3bf0efee79753a04a6fede54b363ab7e7384ae28e3be075f74509adafe63de7eaba09b5ff21017d295471fb6af085828c2c6b172087738a1"

RPROVIDES:${PN} += "cmake-Qt5 \
cmake-Qt5Core \
libQt5Core-devel \
pkgconfig-Qt5Core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Core5 \
libqt5-qtbase-common-devel"

inherit rpm
