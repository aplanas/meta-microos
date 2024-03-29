SUMMARY = "Incidenceeditor Library"
DESCRIPTION = "The IncidenceEditor library for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5IncidenceEditor5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "6cd438cefd88f48560d70aaea5fbc4de520463e3df5c05513d1c7ac7a962155d39c7451fde97cf2407d51f33117a1be88740df27627ba03034823f79ae2eb393"

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
libKPim5Mime.so.5 \
libKPim5PimCommonAkonadi.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
