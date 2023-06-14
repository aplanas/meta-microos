SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5CalendarEvents5-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "e00b32ed1666bf1cfedbd29b02b1115e8b730719482e9560215a4db7a304c8bee7d74420a8eadd40205e89a5cf3b0cb790e22db7723d5123543d5ca4c4dd08c5"

RPROVIDES:${PN} += "libKF5CalendarEvents.so.5 \
libKF5CalendarEvents5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
