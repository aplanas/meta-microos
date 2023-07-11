SUMMARY = "Libraries for Integrated Development Environments"
DESCRIPTION = "This package contains the libraries for integrated development \
environments based on the KDevelop framework."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkdevplatform511-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "569660dc5082e90e316c890643a34c1cc5188db4416a2b8489da6639634031a6ea1c3ab7d5228c41d5c67e4f3965564badf5c5293f87ee97168c509996617483"

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
