SUMMARY = "Personal Organizer"
DESCRIPTION = "KOrganizer is a calendar application by KDE."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "korganizer-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "024a0cc559dc7a42efaeee725b75f120474c37e563cd897882289ef312150d184c31bf98d81791b2760776c78ec5c2bdc2725f62dca5bd9ed420dca269cbf4eb"

RPROVIDES:${PN} += "korganizer \
korganizer5 \
libkorganizer-core.so.5 \
libkorganizer-interfaces.so.5 \
libkorganizerprivate.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-calendar-tools \
kalendarac \
kdepim-addons \
kdepim-runtime \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiNotes.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5CalendarSupport.so.5 \
libKPim5CalendarUtils.so.5 \
libKPim5ContactEditor.so.5 \
libKPim5EventViews.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5IncidenceEditor.so.5 \
libKPim5KontactInterface.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5MailTransport.so.5 \
libKPim5Mime.so.5 \
libKPim5PimCommon.so.5 \
libKPim5PimCommonAkonadi.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
