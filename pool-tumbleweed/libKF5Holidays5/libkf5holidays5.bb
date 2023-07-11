SUMMARY = "Holiday API for KDE PIM"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Holidays5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "ebdb6b1e566a75d0dee5da722f7a86ec54cf7ff218eabdab2512d51c916f6348a32e80fbed959422c5bfe5089c2f1963e621cdc7f825d0e148e081cc250ef87f"

RPROVIDES:${PN} += "kholidays-lang \
libKF5Holidays.so.5 \
libKF5Holidays5 \
libkholidaysdeclarativeplugin.so \
qt5qmlimport-org.kde.kholidays.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
