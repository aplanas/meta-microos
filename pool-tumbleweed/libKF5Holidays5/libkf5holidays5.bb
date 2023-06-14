SUMMARY = "Holiday API for KDE PIM"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Holidays5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "1deaf03084116804744faad525227925683d8d5df85f7a2d49072b802cc93bff27da153579048f8ff38a3207c199e81bc02f86cf36e211d63a8f407f014b06a5"

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
