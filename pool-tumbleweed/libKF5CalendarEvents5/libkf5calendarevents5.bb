SUMMARY = "Integration of QML and KDE workspaces"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5CalendarEvents5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "4b269f5ec0e1859a3dc2e7001880daaad5690e3c810a1b0781369fdcb15f3e02dd5a54473d036e7704df8161b243a79d3202e0bc5ffa6172bfebd3f045663f57"

RPROVIDES:${PN} += "libKF5CalendarEvents.so.5 \
libKF5CalendarEvents5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
