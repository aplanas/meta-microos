SUMMARY = "Calendar Application"
DESCRIPTION = "Calendar application using Akonadi to sync with external services (NextCloud, GMail, ...)."
LICENSE = "GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "kalendar-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f0e334d9e7b11bfa230f3c24504d1605b7bbc5e750dd8e335e4fc259d72eb6ca0c3b0fdc3d04567ffa3d04e44eff2bffa63b6f5960220dd5bba272cd9b7c844c"

RPROVIDES:${PN} += "kalendar \
libakonadi-quick-plugin.so \
libkalendar-calendar-plugin.so \
libkalendar-components-plugin.so \
libkalendar-contact-plugin.so \
libkalendar-mail-plugin.so \
qt5qmlimport-org.kde.akonadi.1 \
qt5qmlimport-org.kde.kalendar.calendar.1 \
qt5qmlimport-org.kde.kalendar.components.1 \
qt5qmlimport-org.kde.kalendar.contact.1 \
qt5qmlimport-org.kde.kalendar.mail.1"

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
libKPim5CalendarSupport.so.5 \
libKPim5EventViews.so.5 \
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
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-QtWebEngine.1 \
qt5qmlimport-org.kde.akonadi.1 \
qt5qmlimport-org.kde.kalendar.calendar.1 \
qt5qmlimport-org.kde.kalendar.components.1 \
qt5qmlimport-org.kde.kalendar.contact.1 \
qt5qmlimport-org.kde.kalendar.mail.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kirigamiaddons.labs.mobileform.0 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.prison.1"

inherit rpm
