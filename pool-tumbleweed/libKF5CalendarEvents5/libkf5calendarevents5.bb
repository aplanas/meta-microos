SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5CalendarEvents5-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "b7090a346a34d7405de7766e697a16877dfb9c68dc5924ee9f371deaa104baf4918bd735660ba97947ec70acc33d6816730b3f5475c1b2914395227ea1c1da81"

RPROVIDES:${PN} += "libKF5CalendarEvents.so.5 \
libKF5CalendarEvents5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
