SUMMARY = "Development files for the Qt 5 Quick 3D library"
DESCRIPTION = "Development files for the Qt 5 Quick 3D library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuick-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "d478873ecb3342fafc0c4b81c23c03cd516ade11039fc6fbbd90e21c77f9ab541a569f9f90be4e96d55cbdd5ac80e8d18ea44c750d3374d896bbbc9707ee3ce7"

RPROVIDES:${PN} += "cmake-Qt53DQuick \
libQt53DQuick-devel \
pkgconfig-Qt53DQuick"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt53DQuick5 \
pkgconfig-Qt53DCore \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick"

inherit rpm
