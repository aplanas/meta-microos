SUMMARY = "Addons for KDE PIM applications"
DESCRIPTION = "Addons for KDE PIM applications, such as extensions for KMail, additional \
themes, and plugins providing extra or advanced functionality."
LICENSE = "GPL-2.0-only"

PV = "23.04.1"

RPM_NAME = "kdepim-addons-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "cc6942ad3f8c8a94ed390591eb83c3778ac50717bd53b4b54d5c66d743a4befa32f0adc62d2ea38f149cd6185270244fcd51e1e9c9a1d04065e9c71143ffb2ad"

RPROVIDES:${PN} += "kdepim-addons \
kdepim-addons(aarch-64) \
libadblocklibprivate.so.5()(64bit) \
libakonadidatasetools.so.5()(64bit) \
libdkimverifyconfigure.so.5()(64bit) \
libexpireaccounttrashfolderconfig.so.5()(64bit) \
libfolderconfiguresettings.so.5()(64bit) \
libkaddressbookmergelibprivate.so.5()(64bit) \
libkmailconfirmbeforedeleting.so.5()(64bit) \
libkmailmarkdown.so.5()(64bit) \
libkmailquicktextpluginprivate.so.5()(64bit) \
libopenurlwithconfigure.so.5()(64bit) \
libpimcalendarsplugin.so()(64bit) \
libscamconfiguresettings.so.5()(64bit) \
libshorturlpluginprivate.so.5()(64bit) \
qt5qmlimport(org.kde.plasma.PimCalendars.1)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGrantlee_Templates.so.5()(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5CalendarEvents.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5Holidays.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5PimCommon.so.5()(64bit) \
libKF5PimCommonAkonadi.so.5()(64bit) \
libKF5Prison.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5SyntaxHighlighting.so.5()(64bit) \
libKF5TextGrammarCheck.so.1()(64bit) \
libKF5TextTranslator.so.1()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AddressbookImportExport.so.5()(64bit) \
libKPim5AkonadiCalendar.so.5()(64bit) \
libKPim5AkonadiContact.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiMime.so.5()(64bit) \
libKPim5AkonadiNotes.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5CalendarSupport.so.5()(64bit) \
libKPim5CalendarUtils.so.5()(64bit) \
libKPim5EventViews.so.5()(64bit) \
libKPim5GrantleeTheme.so.5()(64bit) \
libKPim5Gravatar.so.5()(64bit) \
libKPim5IMAP.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5ImportWizard.so.5()(64bit) \
libKPim5IncidenceEditor.so.5()(64bit) \
libKPim5Itinerary.so.5()(64bit) \
libKPim5KSieveUi.so.5()(64bit) \
libKPim5Libkdepim.so.5()(64bit) \
libKPim5Libkleo.so.5()(64bit) \
libKPim5MailCommon.so.5()(64bit) \
libKPim5MailImporter.so.5()(64bit) \
libKPim5MailTransport.so.5()(64bit) \
libKPim5MailTransportAkonadi.so.5()(64bit) \
libKPim5MessageComposer.so.5()(64bit) \
libKPim5MessageCore.so.5()(64bit) \
libKPim5MessageViewer.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libKPim5MimeTreeParser.so.5()(64bit) \
libKPim5PkPass.so.5()(64bit) \
libKPim5TemplateParser.so.5()(64bit) \
libKPim5TextEdit.so.5()(64bit) \
libKPim5Tnef.so.5()(64bit) \
libKPim5WebEngineViewer.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgpgmepp.so.6()(64bit) \
libmarkdown.so.3()(64bit) \
libqgpgme.so.15()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.Private.1) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.plasma.PimCalendars.1) \
qt5qmlimport(org.kde.plasma.core.2)"

inherit rpm
