SUMMARY = "Addons for KDE PIM applications"
DESCRIPTION = "Addons for KDE PIM applications, such as extensions for KMail, additional \
themes, and plugins providing extra or advanced functionality."
LICENSE = "GPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kdepim-addons-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "386a0dda6937edae56323a4890266bd92acc963c466032a738c93b6a54f66f0493b3c447e0c1f9eb554fa8621c23ccb32d1fb6d69a71c9a32a06c39d7565b57b"

RPROVIDES:${PN} += "kdepim-addons \
libadblocklibprivate.so.5 \
libakonadidatasetools.so.5 \
libdkimverifyconfigure.so.5 \
libexpireaccounttrashfolderconfig.so.5 \
libfolderconfiguresettings.so.5 \
libkaddressbookmergelibprivate.so.5 \
libkmailconfirmbeforedeleting.so.5 \
libkmailmarkdown.so.5 \
libkmailquicktextpluginprivate.so.5 \
libopenurlwithconfigure.so.5 \
libpimcalendarsplugin.so \
libscamconfiguresettings.so.5 \
libshorturlpluginprivate.so.5 \
qt5qmlimport-org.kde.plasma.PimCalendars.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5CalendarCore.so.5 \
libKF5CalendarEvents.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5Holidays.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5PimCommon.so.5 \
libKF5PimCommonAkonadi.so.5 \
libKF5Prison.so.5 \
libKF5Service.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextGrammarCheck.so.1 \
libKF5TextTranslator.so.1 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AddressbookImportExport.so.5 \
libKPim5AkonadiCalendar.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiNotes.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5CalendarSupport.so.5 \
libKPim5CalendarUtils.so.5 \
libKPim5EventViews.so.5 \
libKPim5GrantleeTheme.so.5 \
libKPim5Gravatar.so.5 \
libKPim5IMAP.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5ImportWizard.so.5 \
libKPim5IncidenceEditor.so.5 \
libKPim5Itinerary.so.5 \
libKPim5KSieveUi.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5Libkleo.so.5 \
libKPim5MailCommon.so.5 \
libKPim5MailImporter.so.5 \
libKPim5MailTransport.so.5 \
libKPim5MailTransportAkonadi.so.5 \
libKPim5MessageComposer.so.5 \
libKPim5MessageCore.so.5 \
libKPim5MessageViewer.so.5 \
libKPim5Mime.so.5 \
libKPim5MimeTreeParser.so.5 \
libKPim5PkPass.so.5 \
libKPim5TemplateParser.so.5 \
libKPim5TextEdit.so.5 \
libKPim5Tnef.so.5 \
libKPim5WebEngineViewer.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.6 \
libmarkdown.so.3 \
libqgpgme.so.15 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.plasma.PimCalendars.1 \
qt5qmlimport-org.kde.plasma.core.2"

inherit rpm
