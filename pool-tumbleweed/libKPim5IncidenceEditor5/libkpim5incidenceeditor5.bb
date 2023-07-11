SUMMARY = "Incidenceeditor Library"
DESCRIPTION = "The IncidenceEditor library for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5IncidenceEditor5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "99f3805ecbcce62ac5c7b54bd577d89fe482877170ed0793a9adbe04b207ff4d4a87d68119198d67f8c8025cac5c8bb0230f7d2b9c92fd3e7a6d4b8972f3374b"

RPROVIDES:${PN} += "libKPim5IncidenceEditor.so.5 \
libKPim5IncidenceEditor5"

RDEPENDS:${PN} += "/sbin/ldconfig \
incidenceeditor \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5PimCommonAkonadi.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKGantt.so.2 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5CalendarSupport.so.5 \
libKPim5CalendarUtils.so.5 \
libKPim5EventViews.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5Ldap.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5MailTransportAkonadi.so.5 \
libKPim5Mime.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
