SUMMARY = "Development files for Qt5's State Chart XML library"
DESCRIPTION = "You need this package if you want to compile programs with QtScxml."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtscxml-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "666709d3784af4bb6ca79351705bdcc653c789c28950a2826349c1029b7da34886c4aa293ea8710a132234e2f3c61c18ed104c789cd1aede4d333ccda82e6df3"

RPROVIDES:${PN} += "cmake-Qt5Scxml \
libqt5-qtscxml-devel \
pkgconfig-Qt5Scxml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Scxml5 \
libqt5-qtscxml-tools \
pkgconfig-Qt5Core \
pkgconfig-Qt5Qml"

inherit rpm
