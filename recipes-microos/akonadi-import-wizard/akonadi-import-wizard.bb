SUMMARY = "Assistant to import PIM data"
DESCRIPTION = "Assistant to import PIM data from other applications into Akonadi for use in \
KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-import-wizard-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "32e61ddb8dca8732d9a4549a492b2f115dda3c7be9c9510d5c8c3591ceb97f87fb2e89fa21987fc8fbea8f96a6dc69f1a976acf81d6f4546e4baf92776681435"

RPROVIDES:${PN} += "akonadi-import-wizard akonadi-import-wizard(aarch-64) application() application(org.kde.akonadiimportwizard.desktop)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5Contacts.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5PimCommon.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libKPim5AkonadiWidgets.so.5()(64bit) libKPim5IdentityManagement.so.5()(64bit) libKPim5ImportWizard.so.5()(64bit) libKPim5MailCommon.so.5()(64bit) libKPim5MailImporter.so.5()(64bit) libKPim5MailImporterAkonadi.so.5()(64bit) libKPim5MailTransport.so.5()(64bit) libKPim5MessageViewer.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
