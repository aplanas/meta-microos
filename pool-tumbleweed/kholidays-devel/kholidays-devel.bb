SUMMARY = "Development files for the KDE PIM Holiday API"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications depending on the kholidays library"
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kholidays-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2a674dd681b5201ba14911e5a32f1355f1ed8ad2d75e799749ef04e4fe3e00f6853fcce534d5acaa7f221dd944caabce296f519de9af736a1cdb824818756a9c"

RPROVIDES:${PN} += "cmake-KF5Holidays \
kholidays-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
libKF5Holidays5"

inherit rpm
