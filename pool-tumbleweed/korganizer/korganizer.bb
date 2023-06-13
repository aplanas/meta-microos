SUMMARY = "Personal Organizer"
DESCRIPTION = "KOrganizer is a calendar application by KDE."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "korganizer-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fcae8a6a0eaeb62b7ace78fbd2b985410bee5dff17c01741ed7ead69755214f95bc48b70f37648e27fa39282ee2d68cc6979eb10fc86b459d8f3f1e02f22a10f"

RPROVIDES:${PN} += "application() \
application(korganizer-import.desktop) \
application(korganizer-view.desktop) \
application(org.kde.korganizer.desktop) \
korganizer \
korganizer(aarch-64) \
korganizer5 \
libkorganizer_core.so.5()(64bit) \
libkorganizer_interfaces.so.5()(64bit) \
libkorganizerprivate.so.5()(64bit) \
metainfo() \
metainfo(org.kde.korganizer.appdata.xml) \
mimehandler(application/x-vnd.akonadi.calendar.event) \
mimehandler(application/x-vnd.akonadi.calendar.journal) \
mimehandler(application/x-vnd.akonadi.calendar.todo) \
mimehandler(text/calendar)"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-calendar-tools \
kalendarac \
kdepim-addons \
kdepim-runtime \
ld-linux-aarch64.so.1()(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5Holidays.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5PimCommon.so.5()(64bit) \
libKF5PimCommonAkonadi.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiCalendar.so.5()(64bit) \
libKPim5AkonadiContact.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiNotes.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5CalendarSupport.so.5()(64bit) \
libKPim5CalendarUtils.so.5()(64bit) \
libKPim5EventViews.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5IncidenceEditor.so.5()(64bit) \
libKPim5KontactInterface.so.5()(64bit) \
libKPim5Libkdepim.so.5()(64bit) \
libKPim5MailTransport.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
