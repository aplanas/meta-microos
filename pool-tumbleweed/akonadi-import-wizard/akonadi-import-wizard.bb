SUMMARY = "Assistant to import PIM data"
DESCRIPTION = "Assistant to import PIM data from other applications into Akonadi for use in \
KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-import-wizard-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "81e540d842cf1759509f50de587a5c470946cf23e75acee6290bd6fac25da7558d5af72eb5f9e831648635f33081caa43ce25ea615b88f0fcdd0378abd412f77"

RPROVIDES:${PN} += "akonadi-import-wizard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5PimCommon.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5ImportWizard.so.5 \
libKPim5MailCommon.so.5 \
libKPim5MailImporter.so.5 \
libKPim5MailImporterAkonadi.so.5 \
libKPim5MailTransport.so.5 \
libKPim5MessageViewer.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
