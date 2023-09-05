SUMMARY = "TNEF Support"
DESCRIPTION = "This package contains the TNEF support library for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5Tnef5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "170fd3f820aedf7e4ba80a52cda4bea0d58cd95ca152baa84d29d8dfbd74b392bc5e59ea7ac781e1b229a90b92549a1015214014dc82abfaff01b73f82fa1534"

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
