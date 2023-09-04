SUMMARY = "Add-ons for the Kirigami framework"
DESCRIPTION = "A set of 'widgets' i.e visual end user components along with a \
code to support them. Components are usable by both touch and \
desktop experiences providing a native experience on both, and \
look native with any QQC2 style (qqc2-desktop-theme, Material \
or Plasma)."
LICENSE = "LGPL-3.0-only"

PV = "0.11.0"

RPM_NAME = "kirigami-addons-0.11.0-1.1.aarch64.rpm"
RPM_HASH = "d0145a2aea7a7ae419fa663b3925c851d5d2a2ccbecd0a122513f1aad0e368444d45b5e1f1cf9159432670dbc2845e730edf4099a86b78afd0af3f935a26f503"

RPROVIDES:${PN} += "kirigami-addons \
libcomponentslabsplugin.so \
libcomponentsplugin.so \
libdateandtimeplugin.so \
libdelegatesplugin.so \
libformcardplugin.so \
libmobileformplugin.so \
libsettingsplugin.so \
libsoundsplugin.so \
libtreeviewplugin.so \
qt5qmlimport-org.kde.kirigamiaddons.components.1 \
qt5qmlimport-org.kde.kirigamiaddons.dateandtime.0 \
qt5qmlimport-org.kde.kirigamiaddons.delegates.1 \
qt5qmlimport-org.kde.kirigamiaddons.formcard.1 \
qt5qmlimport-org.kde.kirigamiaddons.labs.components.1 \
qt5qmlimport-org.kde.kirigamiaddons.labs.mobileform.0 \
qt5qmlimport-org.kde.kirigamiaddons.settings.1 \
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
qt5qmlimport-org.kde.kirigamiaddons.components.1 \
qt5qmlimport-org.kde.kirigamiaddons.dateandtime.0 \
qt5qmlimport-org.kde.kirigamiaddons.delegates.1 \
qt5qmlimport-org.kde.kirigamiaddons.sounds.0 \
qt5qmlimport-org.kde.kirigamiaddons.treeview.1 \
qt5qmlimport-org.kde.kitemmodels.1 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.qqc2desktopstyle.private.1"

inherit rpm
