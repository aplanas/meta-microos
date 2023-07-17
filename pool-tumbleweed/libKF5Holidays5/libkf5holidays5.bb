SUMMARY = "Holiday API for KDE PIM"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Holidays5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "c7bef0604b6c0cde2288779c4a678a11178afb476b6d22bd254ca509d9552156911e9434e7149d19e24a5905a21e75ac6b71a9362dea4f276e030594988f7dbe"

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
