SUMMARY = "Qt6 QmlDom static library"
DESCRIPTION = "The Qt6 QmlDom static library. \
The goal of the Dom library is to provide a nicer to use basis for the \
Qml Code model, to be used by the various QML tools, the designer and \
the new compiler."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmldom-devel-static-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "508258b29ceeb7e397e73e1e0bec04530949bb90a0536ae9687645d679331ba8e8c25fb5fbed1d543efb57686702831b910d62c9e9dc1c70094563155cabf7b8"

RPROVIDES:${PN} += "cmake-Qt6QmlDomPrivate \
qt6-qmldom-devel-static \
qt6-qmldom-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlCompilerPrivate \
qt6-qml-private-devel"

inherit rpm
