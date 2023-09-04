SUMMARY = "Development files for libsignon-qt1"
DESCRIPTION = "This package contains the development files for the signon-qt library."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "libsignon-qt5-devel-8.61-1.1.aarch64.rpm"
RPM_HASH = "c6003c186793b3dd7891d874c34eb5200dde82edbf3644a36c002a3d930e1aa3e2009b6d741f14440b27ab15e15cd5b48b23ec7b39227639869b803f35d1dab2"

RPROVIDES:${PN} += "cmake-SignOnQt5 \
libsignon-qt5-devel \
pkgconfig-libsignon-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignon-qt5-1 \
pkgconfig-Qt5Core"

inherit rpm
