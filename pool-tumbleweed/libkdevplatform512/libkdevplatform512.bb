SUMMARY = "Libraries for Integrated Development Environments"
DESCRIPTION = "This package contains the libraries for integrated development \
environments based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkdevplatform512-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d91c29914903ffbfe9381e2b157fa10e9c5171a87381c73845fb5eee7a1eb7207ed418dc0e09524e0f013b2837067d99e4a7839a56d801ad0e8444f6981b5be9"

RPROVIDES:${PN} += "libKDevPlatformDebugger.so.512 \
libKDevPlatformDocumentation.so.512 \
libKDevPlatformInterfaces.so.512 \
libKDevPlatformLanguage.so.512 \
libKDevPlatformOutputView.so.512 \
libKDevPlatformProject.so.512 \
libKDevPlatformSerialization.so.512 \
libKDevPlatformShell.so.512 \
libKDevPlatformSublime.so.512 \
libKDevPlatformUtil.so.512 \
libKDevPlatformVcs.so.512 \
libkdevplatform512"

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
