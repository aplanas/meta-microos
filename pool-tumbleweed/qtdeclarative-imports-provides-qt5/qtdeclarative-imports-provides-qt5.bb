SUMMARY = "RPM provides for QML modules from qtdeclarative"
DESCRIPTION = "A separately built package to avoid a build cycle."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qtdeclarative-imports-provides-qt5-1.0-1.18.aarch64.rpm"
RPM_HASH = "df3b0567c49db387a2c0ff6fda86b1736c0b8255f456f1c0f713e419efd8061df23ab9e5f1a6baa1d514c0852b99db7a484868a2fd0d4852381966a8ac371f62"

RPROVIDES:${PN} += "qt5qmlimport(Qt.labs.animation.1) \
qt5qmlimport(Qt.labs.folderlistmodel.1) \
qt5qmlimport(Qt.labs.folderlistmodel.2) \
qt5qmlimport(Qt.labs.qmlmodels.1) \
qt5qmlimport(Qt.labs.settings.1) \
qt5qmlimport(Qt.labs.sharedimage.1) \
qt5qmlimport(Qt.labs.wavefrontmesh.1) \
qt5qmlimport(QtQml.2) \
qt5qmlimport(QtQml.Models.2) \
qt5qmlimport(QtQml.StateMachine.1) \
qt5qmlimport(QtQml.WorkerScript.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.LocalStorage.2) \
qt5qmlimport(QtQuick.Particles.2) \
qt5qmlimport(QtQuick.Shapes.1) \
qt5qmlimport(QtQuick.Window.2) \
qtdeclarative-imports-provides-qt5 \
qtdeclarative-imports-provides-qt5(aarch-64)"
RDEPENDS:${PN} += "libQtQuick5"

inherit rpm
