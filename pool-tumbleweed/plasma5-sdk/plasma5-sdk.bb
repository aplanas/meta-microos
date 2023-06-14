SUMMARY = "Plasma SDK"
DESCRIPTION = "Plasma SDK taylored for development of Plasma components, \
such as Widgets, Runners, Dataengines."
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-sdk-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "beb5a2e186474cd900615cd7c133d382303bf69b10cced73361ce8ab7fd8e77258e708f07d3302b95b0b69f59e72fc5ee1f1132cf0a95d6879c701e650a16614"

RPROVIDES:${PN} += "plasma5-sdk \
plasma5-sdk-zsh-completion"

RDEPENDS:${PN} += "bash \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5Declarative.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Package.so.5 \
libKF5Plasma.so.5 \
libKF5PlasmaQuick.so.5 \
libKF5QuickAddons.so.5 \
libKF5TextEditor.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6 \
plasmaengineexplorer5 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.draganddrop.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.kquickcontrols.2 \
qt5qmlimport-org.kde.kquickcontrolsaddons.2 \
qt5qmlimport-org.kde.newstuff.1 \
qt5qmlimport-org.kde.plasma.components.2 \
qt5qmlimport-org.kde.plasma.components.3 \
qt5qmlimport-org.kde.plasma.configuration.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.extras.2 \
qt5qmlimport-org.kde.plasma.plasmoid.2"

inherit rpm
