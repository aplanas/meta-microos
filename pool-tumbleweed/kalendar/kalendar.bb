SUMMARY = "Calendar Application"
DESCRIPTION = "Calendar application using Akonadi to sync with external services (NextCloud, GMail, ...)."
LICENSE = "GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "kalendar-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f0e334d9e7b11bfa230f3c24504d1605b7bbc5e750dd8e335e4fc259d72eb6ca0c3b0fdc3d04567ffa3d04e44eff2bffa63b6f5960220dd5bba272cd9b7c844c"

RPROVIDES:${PN} += "application() \
application(org.kde.kalendar.desktop) \
kalendar \
kalendar(aarch-64) \
libakonadi_quick_plugin.so()(64bit) \
libkalendar_calendar_plugin.so()(64bit) \
libkalendar_components_plugin.so()(64bit) \
libkalendar_contact_plugin.so()(64bit) \
libkalendar_mail_plugin.so()(64bit) \
metainfo() \
metainfo(org.kde.kalendar.appdata.xml) \
mimehandler(text/calendar) \
qt5qmlimport(org.kde.akonadi.1) \
qt5qmlimport(org.kde.kalendar.calendar.1) \
qt5qmlimport(org.kde.kalendar.components.1) \
qt5qmlimport(org.kde.kalendar.contact.1) \
qt5qmlimport(org.kde.kalendar.mail.1)"
RDEPENDS:${PN} += "kalendarac \
kdepim-addons \
kdepim-runtime \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiCalendar.so.5()(64bit) \
libKPim5AkonadiContact.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiMime.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5CalendarSupport.so.5()(64bit) \
libKPim5EventViews.so.5()(64bit) \
libKPim5MailCommon.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
qt5qmlimport(Qt.labs.platform.1) \
qt5qmlimport(Qt.labs.qmlmodels.1) \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtLocation.5) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQml.Models.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(QtWebEngine.1) \
qt5qmlimport(org.kde.akonadi.1) \
qt5qmlimport(org.kde.kalendar.calendar.1) \
qt5qmlimport(org.kde.kalendar.components.1) \
qt5qmlimport(org.kde.kalendar.contact.1) \
qt5qmlimport(org.kde.kalendar.mail.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kirigamiaddons.labs.mobileform.0) \
qt5qmlimport(org.kde.kitemmodels.1) \
qt5qmlimport(org.kde.prison.1)"

inherit rpm
