SUMMARY = "Akonadi resources for PIM applications"
DESCRIPTION = "This package contains the Akonadi resources, agents and plugins needed to \
use PIM applications."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdepim-runtime-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "de53457eedc3196375596ea71c9a83488e51889d55475e92482287d5e1f69965c0d41f0c589de44d6a6d08b6b0f33380f202722b6875ea423b0e50e335a229de"

RPROVIDES:${PN} += "application() \
application(org.kde.akonadi_davgroupware_resource.desktop) \
application(org.kde.akonadi_google_resource.desktop) \
application(org.kde.akonadi_imap_resource.desktop) \
application(org.kde.akonadi_kolab_resource.desktop) \
kdepim-runtime \
kdepim-runtime(aarch-64) \
kio-pimlibs \
libakonadi-filestore.so.5()(64bit) \
libakonadi-singlefileresource.so.5()(64bit) \
libfolderarchivesettings.so.5()(64bit) \
libkmindexreader.so.5()(64bit) \
libmaildir.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-plugin-calendar \
akonadi-plugin-contacts \
akonadi-plugin-mime \
akonadi-server \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DAV.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKPim5AkonadiAgentBase.so.5()(64bit) \
libKPim5AkonadiCalendar.so.5()(64bit) \
libKPim5AkonadiContact.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiMime.so.5()(64bit) \
libKPim5AkonadiNotes.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5GAPICalendar.so.5()(64bit) \
libKPim5GAPICore.so.5()(64bit) \
libKPim5GAPIPeople.so.5()(64bit) \
libKPim5GAPITasks.so.5()(64bit) \
libKPim5IMAP.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5IdentityManagementWidgets.so.5()(64bit) \
libKPim5Ldap.so.5()(64bit) \
libKPim5Libkdepim.so.5()(64bit) \
libKPim5MailTransport.so.5()(64bit) \
libKPim5MailTransportAkonadi.so.5()(64bit) \
libKPim5Mbox.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5NetworkAuth.so.5()(64bit) \
libQt5NetworkAuth.so.5(Qt_5)(64bit) \
libQt5TextToSpeech.so.5()(64bit) \
libQt5TextToSpeech.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkolabxml.so.1()(64bit) \
libqca-qt5.so.2()(64bit) \
libqt5keychain.so.1()(64bit) \
libsasl2.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
shared-mime-info"

inherit rpm