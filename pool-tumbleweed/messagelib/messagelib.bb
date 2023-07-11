SUMMARY = "KDE PIM library for e-mail message parsing and display"
DESCRIPTION = "This package contains the messagelib library. It is used by KDE PIM to parse and \
display emails."
LICENSE = "GPL-2.0-only & GPL-3.0-only & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "messagelib-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "5e0b819484a49d58fb966e198d994237201dcf62ec2253d1e71459cf2dc933013448d8b08ba618e97332e48230fd75a4f79dc1bd5d56bb0805e49dcf48b90f97"

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
