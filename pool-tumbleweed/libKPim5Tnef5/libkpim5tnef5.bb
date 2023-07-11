SUMMARY = "TNEF Support"
DESCRIPTION = "This package contains the TNEF support library for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5Tnef5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b96682e00dfd6b57205b34fb6eb3a98fe714689bddd541a4c58116a37fb843fcc9ae3227ad24da2295271c7811844f45d69adc655ace3ed64ba1b5694b2e8984"

RPROVIDES:${PN} += "libKPim5Tnef.so.5 \
libKPim5Tnef5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Contacts.so.5 \
libKF5I18n.so.5 \
libKPim5CalendarUtils.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
