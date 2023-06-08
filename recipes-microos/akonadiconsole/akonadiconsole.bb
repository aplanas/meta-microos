SUMMARY = "Management and debugging console for akonadi"
DESCRIPTION = "Akonadi Console is a utility that can be used to explore or manage \
Akonadi. This utility exposes Akonadi internals, and can be useful \
for debugging."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadiconsole-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "ed15b43c00126c3969816151a7851efa20dd569e232b60dc6f3e526a5ebfd746cfbc2198c2d4497ade3259136ffeabd995db66acac24abd882f466b7a4312013"

RPROVIDES:${PN} += "akonadiconsole akonadiconsole(aarch-64) application() application(org.kde.akonadiconsole.desktop) libakonadiconsole.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CalendarCore.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5AkonadiContact.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiPrivate.so.5()(64bit) libKPim5AkonadiSearchCore.so.5()(64bit) libKPim5AkonadiSearchXapian.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5AkonadiXml.so.5()(64bit) libKPim5CalendarSupport.so.5()(64bit) libKPim5Libkdepim.so.5()(64bit) libKPim5MessageViewer.so.5()(64bit) libKPim5Mime.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libxapian.so.30()(64bit)"

inherit rpm
