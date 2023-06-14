SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Development files for attica, Attica a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "attica-qt5-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c41cfbce299ea75d5172771d951c20b6eae2b9f64cd8f488d3681f7777cd5aa35e8dbc6a5db7b1452218402111ab315dde36ee03eaf88b404ed42fdb69f37c46"

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
