SUMMARY = "Library with utility functions for handling calendar data"
DESCRIPTION = "This library provides a set of utility functions that help \
applications access and use calendar data via the KCalCore library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5CalendarUtils5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "6293e310c4a165833ea192e9a89f333b6a496c5dc5a1a02367e7a9d90c665c1ab382b6b8eb047990a50ef10afee4f7984c4fd3571eb583a6bc5cf1119f656a2b"

RPROVIDES:${PN} += "libKPim5CalendarUtils.so.5 \
libKPim5CalendarUtils5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libKPim5IdentityManagement.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
