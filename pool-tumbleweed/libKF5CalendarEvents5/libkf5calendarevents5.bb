SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5CalendarEvents5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2086ed3fa60022f7101cd5e45900cc52cb1c1bb29b41826d552475c6948441645687b65e70c67503aade582d593aef426c89e888b929c46827ce9d576335f43a"

RPROVIDES:${PN} += "libKF5CalendarEvents.so.5 \
libKF5CalendarEvents5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
