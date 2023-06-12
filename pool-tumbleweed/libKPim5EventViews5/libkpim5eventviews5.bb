SUMMARY = "Eventviews Library"
DESCRIPTION = "This internal library implements a GUI framework for viewing various \
calendar events in agenda, list, month view or timeline fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5EventViews5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b6a591351eb4daa28b0f15065445d316ad66bf532f22edf8d072721e3ec18c147d4edc0a628a4b48051f1564297283e3559d8914fb59c47bf9f017edaabccda8"

RPROVIDES:${PN} += "libKPim5EventViews.so.5()(64bit) \
libKPim5EventViews5 \
libKPim5EventViews5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
eventviews \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5Holidays.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKGantt.so.2()(64bit) \
libKPim5AkonadiCalendar.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5CalendarSupport.so.5()(64bit) \
libKPim5CalendarUtils.so.5()(64bit) \
libKPim5Libkdepim.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
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
