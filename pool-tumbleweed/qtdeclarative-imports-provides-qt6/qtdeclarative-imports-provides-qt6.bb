SUMMARY = "RPM provides for QML modules from qtdeclarative"
DESCRIPTION = "A separately built package to avoid a build cycle."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qtdeclarative-imports-provides-qt6-1.0-1.27.aarch64.rpm"
RPM_HASH = "54117842ac282b1fbd7af09f94e50c013d4c40098ec8ff2eadebf92744942b7532c0f7524722a58f066a6074c97c77fb2ca7f43223b00380510298d28cfac69d"

RPROVIDES:${PN} += "qt6qmlimport-Qt.labs.animation.1 \
qt6qmlimport-Qt.labs.animation.6 \
qt6qmlimport-Qt.labs.folderlistmodel.1 \
qt6qmlimport-Qt.labs.folderlistmodel.2 \
qt6qmlimport-Qt.labs.folderlistmodel.6 \
qt6qmlimport-Qt.labs.platform.1 \
qt6qmlimport-Qt.labs.qmlmodels.1 \
qt6qmlimport-Qt.labs.qmlmodels.6 \
qt6qmlimport-Qt.labs.settings.1 \
qt6qmlimport-Qt.labs.settings.6 \
qt6qmlimport-Qt.labs.sharedimage.1 \
qt6qmlimport-Qt.labs.sharedimage.6 \
qt6qmlimport-Qt.labs.wavefrontmesh.1 \
qt6qmlimport-Qt.labs.wavefrontmesh.6 \
qt6qmlimport-Qt.test.controls.6 \
qt6qmlimport-QtCore.6 \
qt6qmlimport-QtQml.2 \
qt6qmlimport-QtQml.6 \
qt6qmlimport-QtQml.Base.2 \
qt6qmlimport-QtQml.Base.6 \
qt6qmlimport-QtQml.Models.2 \
qt6qmlimport-QtQml.Models.6 \
qt6qmlimport-QtQml.WorkerScript.2 \
qt6qmlimport-QtQml.WorkerScript.6 \
qt6qmlimport-QtQml.XmlListModel.6 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.6 \
qt6qmlimport-QtQuick.Controls.2 \
qt6qmlimport-QtQuick.Controls.6 \
qt6qmlimport-QtQuick.Controls.Basic.2 \
qt6qmlimport-QtQuick.Controls.Basic.6 \
qt6qmlimport-QtQuick.Controls.Basic.impl.2 \
qt6qmlimport-QtQuick.Controls.Basic.impl.6 \
qt6qmlimport-QtQuick.Controls.Fusion.2 \
qt6qmlimport-QtQuick.Controls.Fusion.6 \
qt6qmlimport-QtQuick.Controls.Fusion.impl.2 \
qt6qmlimport-QtQuick.Controls.Fusion.impl.6 \
qt6qmlimport-QtQuick.Controls.Imagine.2 \
qt6qmlimport-QtQuick.Controls.Imagine.6 \
qt6qmlimport-QtQuick.Controls.Imagine.impl.6 \
qt6qmlimport-QtQuick.Controls.Material.2 \
qt6qmlimport-QtQuick.Controls.Material.6 \
qt6qmlimport-QtQuick.Controls.Material.impl.2 \
qt6qmlimport-QtQuick.Controls.Material.impl.6 \
qt6qmlimport-QtQuick.Controls.Universal.2 \
qt6qmlimport-QtQuick.Controls.Universal.6 \
qt6qmlimport-QtQuick.Controls.Universal.impl.2 \
qt6qmlimport-QtQuick.Controls.Universal.impl.6 \
qt6qmlimport-QtQuick.Controls.impl.2 \
qt6qmlimport-QtQuick.Controls.impl.6 \
qt6qmlimport-QtQuick.Dialogs.6 \
qt6qmlimport-QtQuick.Dialogs.quickimpl.2 \
qt6qmlimport-QtQuick.Dialogs.quickimpl.6 \
qt6qmlimport-QtQuick.Effects.2 \
qt6qmlimport-QtQuick.Effects.6 \
qt6qmlimport-QtQuick.Layouts.1 \
qt6qmlimport-QtQuick.Layouts.2 \
qt6qmlimport-QtQuick.Layouts.6 \
qt6qmlimport-QtQuick.LocalStorage.2 \
qt6qmlimport-QtQuick.LocalStorage.6 \
qt6qmlimport-QtQuick.NativeStyle.2 \
qt6qmlimport-QtQuick.NativeStyle.6 \
qt6qmlimport-QtQuick.Particles.2 \
qt6qmlimport-QtQuick.Particles.6 \
qt6qmlimport-QtQuick.Shapes.1 \
qt6qmlimport-QtQuick.Shapes.2 \
qt6qmlimport-QtQuick.Shapes.6 \
qt6qmlimport-QtQuick.Templates.2 \
qt6qmlimport-QtQuick.Templates.6 \
qt6qmlimport-QtQuick.Window.2 \
qt6qmlimport-QtQuick.Window.6 \
qt6qmlimport-QtQuick.tooling.1 \
qt6qmlimport-QtQuick.tooling.6 \
qt6qmlimport-QtTest.1 \
qt6qmlimport-QtTest.6 \
qtdeclarative-imports-provides-qt6"

RDEPENDS:${PN} += "qt6-declarative-imports"

inherit rpm
