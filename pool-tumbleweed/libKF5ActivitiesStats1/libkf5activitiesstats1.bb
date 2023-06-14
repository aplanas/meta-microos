SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5ActivitiesStats1-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "efe40c39efc020a41262e1c06008b29c812816a39de59d84d7bc44e3ea89daed7d88b3a6e937a1504d07d8ceee25ee9634abd1dc789934cd9475ddc17e5b4c58"

RPROVIDES:${PN} += "libKF5ActivitiesStats.so.1 \
libKF5ActivitiesStats1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5ConfigCore.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
