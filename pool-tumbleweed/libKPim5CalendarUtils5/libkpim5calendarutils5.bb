SUMMARY = "Library with utility functions for handling calendar data"
DESCRIPTION = "This library provides a set of utility functions that help \
applications access and use calendar data via the KCalCore library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5CalendarUtils5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "80efc00000bd0cbb51eb1668aae4d954a0feafcfe44bf359cdb1176e12a5cb328d38a4196d49b0f3bc1b368e81198539f14f2da6a649a4603d4e3a72e089a4e7"

RPROVIDES:${PN} += "libKPim5CalendarUtils.so.5()(64bit) \
libKPim5CalendarUtils5 \
libKPim5CalendarUtils5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libGrantlee_Templates.so.5()(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
