SUMMARY = "Akonadi calendar integration - serializer plugin"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write calendar data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadi-plugin-calendar-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "9da440b7dc802ff34ba02f603ef9c3627ac66a7f6bbe7869d2afc1c0ca56954e044c71805922b646842e77e8f784d74702684256f991a7ca8fabe42b8c393b5a"

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
