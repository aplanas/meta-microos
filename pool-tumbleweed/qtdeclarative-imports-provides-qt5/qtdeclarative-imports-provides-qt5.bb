SUMMARY = "RPM provides for QML modules from qtdeclarative"
DESCRIPTION = "A separately built package to avoid a build cycle."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qtdeclarative-imports-provides-qt5-1.0-1.20.aarch64.rpm"
RPM_HASH = "b9d1d83442ba60c01987ca4ddeea458c9a5d92bd984cd19df8921a17a317b50e6a993ce31cd6f3930c377e75ba19ee6113d99a56a4e72dfbfe9fa136a1774db3"

RPROVIDES:${PN} += "qt5qmlimport-Qt.labs.animation.1 \
qt5qmlimport-Qt.labs.folderlistmodel.1 \
qt5qmlimport-Qt.labs.folderlistmodel.2 \
qt5qmlimport-Qt.labs.qmlmodels.1 \
qt5qmlimport-Qt.labs.settings.1 \
qt5qmlimport-Qt.labs.sharedimage.1 \
qt5qmlimport-Qt.labs.wavefrontmesh.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQml.StateMachine.1 \
qt5qmlimport-QtQml.WorkerScript.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.LocalStorage.2 \
qt5qmlimport-QtQuick.Particles.2 \
qt5qmlimport-QtQuick.Shapes.1 \
qt5qmlimport-QtQuick.Window.2 \
qtdeclarative-imports-provides-qt5"

RDEPENDS:${PN} += "libQtQuick5"

inherit rpm
