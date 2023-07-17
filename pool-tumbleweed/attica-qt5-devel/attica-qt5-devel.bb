SUMMARY = "Open Collaboration Service client library - development files"
DESCRIPTION = "Development files for attica, Attica a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "attica-qt5-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "24d88c6b8ca08669c3e079ce4398b7336e384345484c8a4d9400dec63576deda971782d987b8f3a1edf4c8efda4c31a23e8b3473f3231a9126439210a2940ecc"

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
