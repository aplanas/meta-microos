SUMMARY = "KDE PIM library for e-mail message parsing and display"
DESCRIPTION = "This package contains the messagelib library. It is used by KDE PIM to parse and \
display emails."
LICENSE = "GPL-2.0-only & GPL-3.0-only & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "messagelib-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6c591c55811b74f03aa50a3701662f469c26e9ed9d360d21d072e4ed5be28d6720421addbf55ff5a516610d2c6efd057a8d79f8c9b4c7b8ec7770541b6dfae25"

RPROVIDES:${PN} += "libKPim5MessageComposer.so.5()(64bit) \
libKPim5MessageCore.so.5()(64bit) \
libKPim5MessageList.so.5()(64bit) \
libKPim5MessageViewer.so.5()(64bit) \
libKPim5MimeTreeParser.so.5()(64bit) \
libKPim5TemplateParser.so.5()(64bit) \
libKPim5WebEngineViewer.so.5()(64bit) \
messagelib \
messagelib(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGrantlee_Templates.so.5()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5CalendarCore.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5Contacts.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5PimCommon.so.5()(64bit) \
libKF5PimCommonAkonadi.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5SyntaxHighlighting.so.5()(64bit) \
libKF5TextAutoCorrection.so.1()(64bit) \
libKF5TextEditTextToSpeech.so.1()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKPim5AkonadiContact.so.5()(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiMime.so.5()(64bit) \
libKPim5AkonadiSearchPIM.so.5()(64bit) \
libKPim5AkonadiWidgets.so.5()(64bit) \
libKPim5GrantleeTheme.so.5()(64bit) \
libKPim5Gravatar.so.5()(64bit) \
libKPim5IdentityManagement.so.5()(64bit) \
libKPim5IdentityManagementWidgets.so.5()(64bit) \
libKPim5Libkdepim.so.5()(64bit) \
libKPim5Libkleo.so.5()(64bit) \
libKPim5MailTransport.so.5()(64bit) \
libKPim5MailTransportAkonadi.so.5()(64bit) \
libKPim5Mbox.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libKPim5TextEdit.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgpgmepp.so.6()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libqca-qt5.so.2()(64bit) \
libqgpgme.so.15()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
