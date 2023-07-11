SUMMARY = "Qt 5 Quick Controls Addon"
DESCRIPTION = "The Qt Quick Controls module provides a set of controls that \
can be used to build complete interfaces in Qt Quick."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtquickcontrols-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "c84fe1264525d7d8d8a91f804bf483315e04d623bbf61e07cd00ae14f93a6a07d13136f129797da3b8f4364fbc7dae6ffc9f00a8b32a29f80194ede747aada6a"

RPROVIDES:${PN} += "libdialogplugin.so \
libdialogsprivateplugin.so \
libqt5-qtquickcontrols \
libqtquickcontrolsplugin.so \
libqtquickextrasflatplugin.so \
libqtquickextrasplugin.so \
libwidgetsplugin.so \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Controls.Styles.Flat.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Dialogs.Private.1 \
qt5qmlimport-QtQuick.Extras.1 \
qt5qmlimport-QtQuick.Extras.Private.1 \
qt5qmlimport-QtQuick.Extras.Private.CppUtils.1 \
qt5qmlimport-QtQuick.PrivateWidgets.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libQtQuick5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt5qmlimport-Qt.labs.folderlistmodel.2 \
qt5qmlimport-Qt.labs.settings.1 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Private.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Dialogs.Private.1 \
qt5qmlimport-QtQuick.Extras.1 \
qt5qmlimport-QtQuick.Extras.Private.1 \
qt5qmlimport-QtQuick.Extras.Private.CppUtils.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.PrivateWidgets.1 \
qt5qmlimport-QtQuick.Window.2"

inherit rpm
