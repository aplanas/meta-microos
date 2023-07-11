SUMMARY = "Development files for libsignon-qt1"
DESCRIPTION = "This package contains the development files for the signon-qt library."
LICENSE = "LGPL-2.0-only"

PV = "8.60"

RPM_NAME = "libsignon-qt5-devel-8.60-2.19.aarch64.rpm"
RPM_HASH = "1d5da0afee00c05ace5771c7aae93834976e88a6ab26db7e8062d57e670b1e3d8ddb42a973aaa47317519aa844c9781eea1c7a92b1fc08387276e316cfef836e"

RPROVIDES:${PN} += "cmake-SignOnQt5 \
libsignon-qt5-devel \
pkgconfig-libsignon-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignon-qt5-1 \
pkgconfig-Qt5Core"

inherit rpm
