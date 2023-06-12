SUMMARY = "Mail Client"
DESCRIPTION = "KMail is the KDE mail client."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kmail-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a49b8975fdcb6283f77d1a3f756ffd210660dfe7080d5e000be3fb66eab4ac89a1aa6f175ed396958579e472c33d91e72ad1871c09a1066e55100fd243f5063b"

RPROVIDES:${PN} += "application() \
application(kmail_view.desktop) \
application(org.kde.kmail-refresh-settings.desktop) \
application(org.kde.kmail2.desktop) \
kmail \
kmail(aarch-64) \
kmail5 \
libkmailprivate.so.5()(64bit) \
metainfo() \
metainfo(org.kde.kmail2.appdata.xml) \
mimehandler(application/mbox) \
mimehandler(application/x-mimearchive) \
mimehandler(message/rfc822) \
mimehandler(x-scheme-handler/mailto)"
RDEPENDS:${PN} += "/sbin/ldconfig \
grantleetheme \
kdepim-addons \
kdepim-runtime \
kmail-account-wizard \
kmail-application-icons \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5PimCommon.so.5()(64bit) \
libKF5PimCommon5 \
libKF5PimCommonAkonadi.so.5()(64bit) \
libKF5PimCommonAkonadi5 \
libKF5Service.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5TextAutoCorrection.so.1()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiAgentBase.so.5()(64bit) \
libKPim5AkonadiContact.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiMime.so.5()(64bit) \
libKPim5AkonadiSearchDebug.so.5()(64bit) \
libKPim5AkonadiSearchPIM.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5CalendarUtils.so.5()(64bit) \
libKPim5Gravatar.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5IdentityManagementWidgets.so.5()(64bit) \
libKPim5KSieveUi.so.5()(64bit) \
libKPim5KontactInterface.so.5()(64bit) \
libKPim5Ldap.so.5()(64bit) \
libKPim5Libkdepim.so.5()(64bit) \
libKPim5Libkleo.so.5()(64bit) \
libKPim5MailCommon.so.5()(64bit) \
libKPim5MailTransport.so.5()(64bit) \
libKPim5MailTransportAkonadi.so.5()(64bit) \
libKPim5MessageComposer.so.5()(64bit) \
libKPim5MessageCore.so.5()(64bit) \
libKPim5MessageList.so.5()(64bit) \
libKPim5MessageViewer.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libKPim5MimeTreeParser.so.5()(64bit) \
libKPim5TemplateParser.so.5()(64bit) \
libKPim5TextEdit.so.5()(64bit) \
libKPim5WebEngineViewer.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgpgmepp.so.6()(64bit) \
libqgpgme.so.15()(64bit) \
libqt5keychain.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
messagelib"

inherit rpm