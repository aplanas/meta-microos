SUMMARY = "Plasma SDK"
DESCRIPTION = "Plasma SDK taylored for development of Plasma components, \
such as Widgets, Runners, Dataengines."
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-sdk-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "beb5a2e186474cd900615cd7c133d382303bf69b10cced73361ce8ab7fd8e77258e708f07d3302b95b0b69f59e72fc5ee1f1132cf0a95d6879c701e650a16614"

RPROVIDES:${PN} += "application() \
application(org.kde.plasma.cuttlefish.desktop) \
application(org.kde.plasma.lookandfeelexplorer.desktop) \
application(org.kde.plasma.themeexplorer.desktop) \
application(org.kde.plasmoidviewer.desktop) \
metainfo() \
metainfo(org.kde.plasma.lookandfeelexplorer.appdata.xml) \
metainfo(org.kde.plasma.plasmoidviewershell.appdata.xml) \
metainfo(org.kde.plasma.themeexplorer.appdata.xml) \
metainfo(org.kde.plasmoidviewer.appdata.xml) \
plasma5-sdk \
plasma5-sdk(aarch-64) \
plasma5-sdk-zsh-completion"
RDEPENDS:${PN} += "bash \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5Declarative.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Package.so.5()(64bit) \
libKF5Plasma.so.5()(64bit) \
libKF5PlasmaQuick.so.5()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libKF5TextEditor.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
plasmaengineexplorer5 \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(org.kde.draganddrop.2) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kitemmodels.1) \
qt5qmlimport(org.kde.kquickcontrols.2) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.newstuff.1) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.components.3) \
qt5qmlimport(org.kde.plasma.configuration.2) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.extras.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2)"

inherit rpm
