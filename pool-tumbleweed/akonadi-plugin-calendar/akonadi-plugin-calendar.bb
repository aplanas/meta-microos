SUMMARY = "Akonadi calendar integration - serializer plugin"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write calendar data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadi-plugin-calendar-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f3d70b7533de711e7685d3636b03ff2ec97be333d57587c41ce8e880d1959b1548567e22d07733b412db7c797e52a2b67efedeae95ef948c95466721cc51b187"

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
