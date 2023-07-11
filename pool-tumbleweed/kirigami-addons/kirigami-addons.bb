SUMMARY = "Add-ons for the Kirigami framework"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma)."
LICENSE = "LGPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "kirigami-addons-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "70f5d5dbc9c897329a8bccb9534a75f3c8eb69fabab63b1dce97a38c1d38c34c58b39cc44c57632604c389d149d037ba2f175720e274d6deae23acd8741fc2ca"

RPROVIDES:${PN} += "kirigami-addons \
libcomponentsplugin.so \
libdateandtimeplugin.so \
libmobileformplugin.so \
libsoundsplugin.so \
libtreeviewplugin.so \
qt5qmlimport-org.kde.kirigamiaddons.dateandtime.0 \
qt5qmlimport-org.kde.kirigamiaddons.labs.components.1 \
qt5qmlimport-org.kde.kirigamiaddons.labs.mobileform.0 \
qt5qmlimport-org.kde.kirigamiaddons.sounds.0 \
qt5qmlimport-org.kde.kirigamiaddons.treeview.1"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickControls2.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.platform.1 \
qt5qmlimport-Qt.labs.qmlmodels.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtMultimedia.5 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.kirigamiaddons.dateandtime.0 \
qt5qmlimport-org.kde.kirigamiaddons.sounds.0 \
qt5qmlimport-org.kde.kirigamiaddons.treeview.1 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.qqc2desktopstyle.private.1"

inherit rpm
