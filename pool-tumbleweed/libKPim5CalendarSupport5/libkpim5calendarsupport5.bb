SUMMARY = "Library for handling calendaring in PIM applications"
DESCRIPTION = "This package contains the calendarsupport library, used by KDE PIM applications \
to handle calendaring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5CalendarSupport5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "0b7cc04df0931028b9d1bb46ad9012c2190416b15f8dd427421b28dc7f4a3677577e0862fb266195e08c03ad6961001a36484a56add91d6a2bf4ef3796d33bc3"

RPROVIDES:${PN} += "libKPim5CalendarSupport.so.5 \
libKPim5CalendarSupport5"

RDEPENDS:${PN} += "/sbin/ldconfig \
calendarsupport \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiNotes.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5CalendarUtils.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5Mime.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
