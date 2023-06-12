SUMMARY = "Library for handling calendaring in PIM applications"
DESCRIPTION = "This package contains the calendarsupport library, used by KDE PIM applications \
to handle calendaring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5CalendarSupport5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "84a69eaa3add1b7b488270abbbcf1f663c56e56ec58c07e234bf7ea9eddcf9a8f2b7b31dcb45b523ea366993484e17a62cd6841bd28a5ddb20a795b9bd2c5faa"

RPROVIDES:${PN} += "libKPim5CalendarSupport.so.5()(64bit) \
libKPim5CalendarSupport5 \
libKPim5CalendarSupport5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
calendarsupport \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5Holidays.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKPim5AkonadiCalendar.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiNotes.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5CalendarUtils.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libKPim5TextEdit.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
