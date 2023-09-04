SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Development files for attica, Attica a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "attica-qt5-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5ae2a4289d01227b69346b79b9a1b2498453c16447bcef4af745286d02f516252b317de83d5403331d148a49e736e5de79b7ed97680a318f726104811e89efd9"

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
