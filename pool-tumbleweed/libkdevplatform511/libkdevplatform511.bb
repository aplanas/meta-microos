SUMMARY = "Libraries for Integrated Development Environments"
DESCRIPTION = "This package contains the libraries for integrated development \
environments based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkdevplatform511-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "546195f9b38a6552db5b549783d903c723ef0e4fade4651c0604e139adfbea495486fbf7f4121a36c6a48e1ec53a3a8729ed970c96677d8d94ac741d29c0ba84"

RPROVIDES:${PN} += "libKDevPlatformDebugger.so.511 \
libKDevPlatformDocumentation.so.511 \
libKDevPlatformInterfaces.so.511 \
libKDevPlatformLanguage.so.511 \
libKDevPlatformOutputView.so.511 \
libKDevPlatformProject.so.511 \
libKDevPlatformSerialization.so.511 \
libKDevPlatformShell.so.511 \
libKDevPlatformSublime.so.511 \
libKDevPlatformUtil.so.511 \
libKDevPlatformVcs.so.511 \
libkdevplatform511"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdevplatform \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5ItemModels.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5SyntaxHighlighting.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5ThreadWeaver.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
