SUMMARY = "Development files for libqobs"
DESCRIPTION = "This package contains the development files for libqobs, a Qt-based \
Open Build Service (OBS) library."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "libqobs-devel-2.1.0-2.9.aarch64.rpm"
RPM_HASH = "e0241e50df91842f6e3d5eeca67f6bb8b7391aed0c7d389085a82c300183ffc0cdb0ac66d4efe05b2ced9b51fd1cf9e1d2a706ca2038ef6d47f1aeea962ce917"

RPROVIDES:${PN} += "libqobs-devel \
pkgconfig-libqobs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqobs2 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Network"

inherit rpm
