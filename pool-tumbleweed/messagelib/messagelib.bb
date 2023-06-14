SUMMARY = "KDE PIM library for e-mail message parsing and display"
DESCRIPTION = "This package contains the messagelib library. It is used by KDE PIM to parse and \
display emails."
LICENSE = "GPL-2.0-only & GPL-3.0-only & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "messagelib-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6c591c55811b74f03aa50a3701662f469c26e9ed9d360d21d072e4ed5be28d6720421addbf55ff5a516610d2c6efd057a8d79f8c9b4c7b8ec7770541b6dfae25"

RPROVIDES:${PN} += "libKPim5MessageComposer.so.5 \
libKPim5MessageCore.so.5 \
libKPim5MessageList.so.5 \
libKPim5MessageViewer.so.5 \
libKPim5MimeTreeParser.so.5 \
libKPim5TemplateParser.so.5 \
libKPim5WebEngineViewer.so.5 \
messagelib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5Archive.so.5 \
libKF5CalendarCore.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemModels.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5PimCommon.so.5 \
libKF5PimCommonAkonadi.so.5 \
libKF5Service.so.5 \
libKF5SonnetUi.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextAutoCorrection.so.1 \
libKF5TextEditTextToSpeech.so.1 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiSearchPIM.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5GrantleeTheme.so.5 \
libKPim5Gravatar.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5IdentityManagementWidgets.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5Libkleo.so.5 \
libKPim5MailTransport.so.5 \
libKPim5MailTransportAkonadi.so.5 \
libKPim5Mbox.so.5 \
libKPim5Mime.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.6 \
libm.so.6 \
libqca-qt5.so.2 \
libqgpgme.so.15 \
libstdc++.so.6"

inherit rpm
