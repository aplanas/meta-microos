SUMMARY = "Common Mail library for KDE PIM applications"
DESCRIPTION = "This package provides the mailcommon library, a base KDE PIM library \
to build email-handling applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5MailCommon5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "672edf462e9e475f717f98409d213a56b8a99e6c3d1b1102182ff52aaca21cc5fc7530f581fab3a8b23ee3e991d3691e3e6143e2034e28ff4b0e53217630d6e2"

RPROVIDES:${PN} += "libKPim5MailCommon.so.5()(64bit) \
libKPim5MailCommon5 \
libKPim5MailCommon5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5PimCommon.so.5()(64bit) \
libKF5PimCommonAkonadi.so.5()(64bit) \
libKF5SyntaxHighlighting.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiContact.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiMime.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5IdentityManagementWidgets.so.5()(64bit) \
libKPim5Libkdepim.so.5()(64bit) \
libKPim5Libkleo.so.5()(64bit) \
libKPim5MailImporter.so.5()(64bit) \
libKPim5MailTransport.so.5()(64bit) \
libKPim5MessageComposer.so.5()(64bit) \
libKPim5MessageCore.so.5()(64bit) \
libKPim5MessageList.so.5()(64bit) \
libKPim5MessageViewer.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libKPim5TemplateParser.so.5()(64bit) \
libKPim5TextEdit.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgpgmepp.so.6()(64bit) \
libphonon4qt5.so.4()(64bit) \
libqgpgme.so.15()(64bit) \
libstdc++.so.6()(64bit) \
mailcommon"

inherit rpm
