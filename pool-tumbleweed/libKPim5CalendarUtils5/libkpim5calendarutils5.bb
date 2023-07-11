SUMMARY = "Library with utility functions for handling calendar data"
DESCRIPTION = "This library provides a set of utility functions that help \
applications access and use calendar data via the KCalCore library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5CalendarUtils5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b5c894acaf3e4d545640c8b5d117c84fa6d2e2a68f72ed5440e03f9cf44fd7f3c13f47f6b5da2ca075a2e49ebb2fc8bcb65f166958898a07e4342c0b107d53b6"

RPROVIDES:${PN} += "libKPim5CalendarUtils.so.5 \
libKPim5CalendarUtils5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
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
