SUMMARY = "Mail Client"
DESCRIPTION = "KMail is the KDE mail client."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kmail-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f9c33b47b1af159468076734c4df47c445963a3d08d707a2cb6b9d1b2a88299be52163eb78c910366dc320a2c77a3eb2993246c8e3c9c118aab0219917a95613"

RPROVIDES:${PN} += "kmail \
kmail5 \
libkmailprivate.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdepim-addons \
kdepim-runtime \
kmail-account-wizard \
kmail-application-icons \
ktextaddons \
ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextAutoCorrectionCore.so.1 \
libKF5TextAutoCorrectionWidgets.so.1 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiAgentBase.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiSearchDebug.so.5 \
libKPim5AkonadiSearchPIM.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5CalendarUtils.so.5 \
libKPim5ContactEditor.so.5 \
libKPim5Gravatar.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5IdentityManagementWidgets.so.5 \
libKPim5KSieveUi.so.5 \
libKPim5KontactInterface.so.5 \
libKPim5Ldap.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5Libkleo.so.5 \
libKPim5MailCommon.so.5 \
libKPim5MailTransport.so.5 \
libKPim5MessageComposer.so.5 \
libKPim5MessageCore.so.5 \
libKPim5MessageList.so.5 \
libKPim5MessageViewer.so.5 \
libKPim5Mime.so.5 \
libKPim5MimeTreeParser.so.5 \
libKPim5PimCommon.so.5 \
libKPim5PimCommonAkonadi.so.5 \
libKPim5TemplateParser.so.5 \
libKPim5TextEdit.so.5 \
libKPim5WebEngineViewer.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineCore.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.6 \
libqgpgme.so.15 \
libqt5keychain.so.1 \
libstdc++.so.6 \
messagelib"

inherit rpm
