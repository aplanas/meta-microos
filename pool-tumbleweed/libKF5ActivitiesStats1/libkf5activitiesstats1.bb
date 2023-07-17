SUMMARY = "Library for KDE's Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5ActivitiesStats1-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "2db04c3b49ba60ffa2a75ddffc2a12f4152008de1b8c93f13506d45e527370b225939cae9b5f6ab0328587d1bdc1ea5dd7b1ee589226f9d56f9fb0b733a00f40"

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
