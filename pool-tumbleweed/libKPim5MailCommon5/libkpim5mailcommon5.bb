SUMMARY = "Common Mail library for KDE PIM applications"
DESCRIPTION = "This package provides the mailcommon library, a base KDE PIM library \
to build email-handling applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5MailCommon5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "8b2d73779660bcf317bfdbd14c69f8d4ea3f3984a3eb46d447af2fd0acce3db8d072141a757299ec42921943dd0b793b4156954caea8a1abb9d961d1830a4c7d"

RPROVIDES:${PN} += "libKPim5MailCommon.so.5 \
libKPim5MailCommon5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5Contacts.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiContact.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiMime.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5ContactEditor.so.5 \
libKPim5IdentityManagement.so.5 \
libKPim5IdentityManagementWidgets.so.5 \
libKPim5Libkdepim.so.5 \
libKPim5Libkleo.so.5 \
libKPim5MailImporter.so.5 \
libKPim5MailTransport.so.5 \
libKPim5MessageComposer.so.5 \
libKPim5MessageCore.so.5 \
libKPim5MessageList.so.5 \
libKPim5MessageViewer.so.5 \
libKPim5Mime.so.5 \
libKPim5PimCommon.so.5 \
libKPim5PimCommonAkonadi.so.5 \
libKPim5TemplateParser.so.5 \
libKPim5TextEdit.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.6 \
libphonon4qt5.so.4 \
libqgpgme.so.15 \
libstdc++.so.6 \
mailcommon"

inherit rpm
