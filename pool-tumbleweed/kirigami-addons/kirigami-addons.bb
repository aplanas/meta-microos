SUMMARY = "Add-ons for the Kirigami framework"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma)."
LICENSE = "LGPL-3.0-only"

PV = "0.8.0"

RPM_NAME = "kirigami-addons-0.8.0-1.2.aarch64.rpm"
RPM_HASH = "e59cb08ef427b61924bf2b1ccb410fe5a18196e062fe77befadd0019553e0bb7ef1dfa360df77d0c11a2092969f57269a4e8edc60a56d8ae908367b7ad4f817e"

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
