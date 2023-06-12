SUMMARY = "Libraries for Integrated Development Environments"
DESCRIPTION = "This package contains the libraries for integrated development \
environments based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkdevplatform511-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "546195f9b38a6552db5b549783d903c723ef0e4fade4651c0604e139adfbea495486fbf7f4121a36c6a48e1ec53a3a8729ed970c96677d8d94ac741d29c0ba84"

RPROVIDES:${PN} += "libKDevPlatformDebugger.so.511()(64bit) \
libKDevPlatformDocumentation.so.511()(64bit) \
libKDevPlatformInterfaces.so.511()(64bit) \
libKDevPlatformLanguage.so.511()(64bit) \
libKDevPlatformOutputView.so.511()(64bit) \
libKDevPlatformProject.so.511()(64bit) \
libKDevPlatformSerialization.so.511()(64bit) \
libKDevPlatformShell.so.511()(64bit) \
libKDevPlatformSublime.so.511()(64bit) \
libKDevPlatformUtil.so.511()(64bit) \
libKDevPlatformVcs.so.511()(64bit) \
libkdevplatform511 \
libkdevplatform511(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
kdevplatform \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGrantlee_Templates.so.5()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5SyntaxHighlighting.so.5()(64bit) \
libKF5TextEditor.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5ThreadWeaver.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
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
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
