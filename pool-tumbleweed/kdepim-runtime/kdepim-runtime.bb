SUMMARY = "Akonadi resources for PIM applications"
DESCRIPTION = "This package contains the Akonadi resources, agents and plugins needed to \
use PIM applications."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdepim-runtime-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "fd3cc3d1bfb9f6492b68be66fcab40b8759dfffbca660dc71bd6eb70b53582428773d735a2afe53ae41c98e162bad40f929655132e244424db84246662c278c1"

RPROVIDES:${PN} += "kdepim-runtime \
kio-pimlibs \
libakonadi-filestore.so.5 \
libakonadi-singlefileresource.so.5 \
libfolderarchivesettings.so.5 \
libkmindexreader.so.5 \
libmaildir.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-plugin-calendar \
akonadi-plugin-contacts \
akonadi-plugin-mime \
akonadi-server \
ld-linux-aarch64.so.1 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5DAV.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Service.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKPim5AkonadiAgentBase.so.5 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiNotes.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5GAPICalendar.so.5 \
libKPim5GAPICore.so.5 \
libKPim5GAPIPeople.so.5 \
libKPim5GAPITasks.so.5 \
libKPim5IMAP.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5IdentityManagementWidgets.so.5 \
libKPim5Ldap.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5MailTransport.so.5 \
libKPim5MailTransportAkonadi.so.5 \
libKPim5Mbox.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libQt5TextToSpeech.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkolabxml.so.1 \
libqca-qt5.so.2 \
libqt5keychain.so.1 \
libsasl2.so.3 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
