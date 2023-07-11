SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5ActivitiesStats1-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "6f152a24393d9ecb15e04caa423c2cfa153c44dfe4a512a74ab6d1ed74e589e14c815753aabfd19081818bce92298537aca98b54820040ce2bb695fe67e32229"

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
