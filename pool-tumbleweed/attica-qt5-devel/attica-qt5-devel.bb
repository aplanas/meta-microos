SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Development files for attica, Attica a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "attica-qt5-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "e161d96ec1baf42ca16b5994b6cfcf21f55a630ed49956304d9ae1847593faf6847b7f355b4b377c5aca1a1a10be4175421ead4310e183f8d8217cdce6ff6754"

RPROVIDES:${PN} += "attica-qt5-devel \
cmake-KF5Attica \
pkgconfig-libKF5Attica"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
cmake-Qt5Network \
cmake-Qt5Widgets \
libKF5Attica5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Network"

inherit rpm
