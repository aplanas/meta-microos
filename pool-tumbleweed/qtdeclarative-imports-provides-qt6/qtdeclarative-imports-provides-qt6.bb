SUMMARY = "RPM provides for QML modules from qtdeclarative"
DESCRIPTION = "A separately built package to avoid a build cycle."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qtdeclarative-imports-provides-qt6-1.0-1.26.aarch64.rpm"
RPM_HASH = "2e4df0e9dfd39021fa2f66c0e27b31790acccf2d56277e2c380fead03c7fa99920e84d1fb1d74a751aa6124251dc6e7a4f2044945c2747a52f5eb7afe6f4e710"

RPROVIDES:${PN} += "qt6qmlimport-Qt.labs.sharedimage.1 \
qt6qmlimport-Qt.labs.sharedimage.6 \
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
qt6qmlimport-QtQuick.Dialogs.quickimpl.6 \
qt6qmlimport-QtQuick.NativeStyle.2 \
qt6qmlimport-QtQuick.NativeStyle.6 \
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
