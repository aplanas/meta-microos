SUMMARY = "Akonadi calendar integration - serializer plugin"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write calendar data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-plugin-calendar-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5401965798f1a30d980a7f39e0b5b2f3a0e003b875626d97cfae20a42932f3145be075b99164fd642802b7ebbd878a5dfb15f17ef6e02a7fdc0b972625006417"

RPROVIDES:${PN} += "akonadi-plugin-calendar \
libakonadicalendarplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiCalendar5 \
libKPim5AkonadiCore.so.5 \
libKPim5CalendarUtils.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
