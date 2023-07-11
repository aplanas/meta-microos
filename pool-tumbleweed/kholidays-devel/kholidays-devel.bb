SUMMARY = "Development files for the KDE PIM Holiday API"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications depending on the kholidays library"
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kholidays-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "9fa96cdeffe9996b70636c22ea8e827d870b98c236ccc98100a3934b07d2405d9bfe8ab922f2757c9168bd5192d5817f93494cbd7377e9d1fde8b42e8ca856db"

RPROVIDES:${PN} += "cmake-KF5Holidays \
kholidays-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
libKF5Holidays5"

inherit rpm
