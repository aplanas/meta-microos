SUMMARY = "Calendar Application"
DESCRIPTION = "Calendar application using Akonadi to sync with external services (NextCloud, GMail, ...)."
LICENSE = "GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "merkuro-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5de4dd926fffc6ba3b8a84fcbc7011fe73af81563202fc9d50adabae2c71b8a0a609aba0d5b3790e1ac528dc731ff1a0b104fb36c6e050c78ed40a7af36f6177"

RPROVIDES:${PN} += "kalendar \
libakonadi-quick-plugin.so \
libmerkuro-calendar-plugin.so \
libmerkuro-components-plugin.so \
libmerkuro-contact-plugin.so \
libmerkuro-mail-plugin.so \
merkuro \
qt5qmlimport-org.kde.akonadi.1 \
qt5qmlimport-org.kde.merkuro.calendar.1 \
qt5qmlimport-org.kde.merkuro.components.1 \
qt5qmlimport-org.kde.merkuro.contact.1 \
qt5qmlimport-org.kde.merkuro.mail.1"

RDEPENDS:${PN} += "kalendarac \
kdepim-addons \
kdepim-runtime \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5MailCommon.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgme.so.11 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-Qt.labs.qmlmodels.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtLocation.5 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtWebEngine.1 \
qt5qmlimport-org.kde.akonadi.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kirigamiaddons.delegates.1 \
qt5qmlimport-org.kde.kirigamiaddons.labs.components.1 \
qt5qmlimport-org.kde.kirigamiaddons.labs.mobileform.0 \
qt5qmlimport-org.kde.kirigamiaddons.treeview.1 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.merkuro.calendar.1 \
qt5qmlimport-org.kde.merkuro.components.1 \
qt5qmlimport-org.kde.merkuro.contact.1 \
qt5qmlimport-org.kde.merkuro.mail.1 \
qt5qmlimport-org.kde.prison.1"

inherit rpm
