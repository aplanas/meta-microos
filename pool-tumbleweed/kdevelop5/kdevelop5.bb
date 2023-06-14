SUMMARY = "Plugin-extensible IDE for C/C++ and other programming languages"
DESCRIPTION = "KDevelop is an integrated development environment (IDE). \
It provides editing, navigation and debugging features for several programming languages, \
as well as integration with multiple build systems and version-control systems \
using a plugin-based architecture. \
KDevelop has parser backends for C, C++ and Javascript/QML, \
with further external plugins supporting e.g. PHP or Python."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdevelop5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "da3b5be3db5d604546e6bfa5670f655b6c22e7be0898d5dea95a96475b1ebc5b0a672dda305b7c42dbb1bddc74a143550670f215212cfcb141939acba548f611"

RPROVIDES:${PN} += "cmake-KDevelop \
kdevelop \
kdevelop5 \
kdevelop5-cpp-parser \
kdevelop5-plugin-clang \
kdevelop5-plugin-clang-tidy \
kdevelop5-plugin-cppsupport \
kdevelop5-plugin-qmake \
kdevelop5-plugin-qmljs \
libKDevCMakeCommon.so.511 \
libKDevClangPrivate.so.511 \
libKDevCompileAnalyzerCommon.so.511 \
libKDevelopSessionsWatch.so \
libkdevelopdashboarddeclarativeplugin.so \
libkdevelopsessionsplugin.so \
qt5qmlimport-org.kde.kdevplatform.1 \
qt5qmlimport-org.kde.plasma.private.kdevelopsessions.1"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
clang16 \
ld-linux-aarch64.so.1 \
libKDevPlatformDebugger.so.511 \
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
libKF5Archive.so.5 \
libKF5Bookmarks.so.5 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5Declarative.so.5 \
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
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Purpose.so.5 \
libKF5PurposeWidgets.so.5 \
libKF5Runner.so.5 \
libKF5Service.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextEditor.so.5 \
libKF5TextWidgets.so.5 \
libKF5ThreadWeaver.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKasten4Controllers.so.0 \
libKasten4Core.so.0 \
libKasten4Okteta2Controllers.so.0 \
libKasten4Okteta2Core.so.0 \
libKasten4Okteta2Gui.so.0 \
libOkteta3Core.so.0 \
libOkteta3Gui.so.0 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libclang.so.13 \
libgcc-s.so.1 \
libkomparediff2.so.5 \
libm.so.6 \
libprocesscore.so.9 \
libprocessui.so.9 \
libstdc++.so.6 \
libsvn-client-1.so.0 \
libsvn-subr-1.so.0 \
libsvn-wc-1.so.0 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2 \
qt5qmlimport-org.kde.plasma.private.kdevelopsessions.1"

inherit rpm
