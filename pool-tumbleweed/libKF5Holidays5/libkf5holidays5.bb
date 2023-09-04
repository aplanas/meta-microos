SUMMARY = "Holiday API for KDE PIM"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Holidays5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "dcb8d65964572bee709a9864b36239581eece842ea09cb27f8ed610c9feda264d36c74ebd2d064ed6e1966353793f3d04258c38a1d81882733c2a6778edb0608"

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
