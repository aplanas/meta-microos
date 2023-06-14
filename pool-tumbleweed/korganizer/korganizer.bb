SUMMARY = "Personal Organizer"
DESCRIPTION = "KOrganizer is a calendar application by KDE."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "korganizer-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "fcae8a6a0eaeb62b7ace78fbd2b985410bee5dff17c01741ed7ead69755214f95bc48b70f37648e27fa39282ee2d68cc6979eb10fc86b459d8f3f1e02f22a10f"

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
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5PimCommon.so.5 \
libKF5PimCommonAkonadi.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiNotes.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5CalendarSupport.so.5 \
libKPim5CalendarUtils.so.5 \
libKPim5EventViews.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5IncidenceEditor.so.5 \
libKPim5KontactInterface.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5MailTransport.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
