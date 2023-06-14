SUMMARY = "Eventviews Library"
DESCRIPTION = "This internal library implements a GUI framework for viewing various \
calendar events in agenda, list, month view or timeline fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5EventViews5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "b6a591351eb4daa28b0f15065445d316ad66bf532f22edf8d072721e3ec18c147d4edc0a628a4b48051f1564297283e3559d8914fb59c47bf9f017edaabccda8"

RPROVIDES:${PN} += "libKPim5EventViews.so.5 \
libKPim5EventViews5"

RDEPENDS:${PN} += "/sbin/ldconfig \
eventviews \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5WidgetsAddons.so.5 \
libKGantt.so.2 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5CalendarSupport.so.5 \
libKPim5CalendarUtils.so.5 \
libKPim5Libkdepim.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
