SUMMARY = "Management and debugging console for akonadi"
DESCRIPTION = "Akonadi Console is a utility that can be used to explore or manage \
Akonadi. This utility exposes Akonadi internals, and can be useful \
for debugging."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "akonadiconsole-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "af7b94b236f605039f3d59950d343cec51477824bf3530cf0fd37187eeeaeef5a13954a1930bfbc321b1db50a358feb33035d71df7f8198957565d816eac0b15"

RPROVIDES:${PN} += "akonadiconsole \
libakonadiconsole.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiPrivate.so.5 \
libKPim5AkonadiSearchCore.so.5 \
libKPim5AkonadiSearchXapian.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5AkonadiXml.so.5 \
libKPim5CalendarSupport.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5MessageViewer.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxapian.so.30"

inherit rpm
