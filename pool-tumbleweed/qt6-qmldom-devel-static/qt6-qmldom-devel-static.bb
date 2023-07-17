SUMMARY = "Qt6 QmlDom static library"
DESCRIPTION = "The Qt6 QmlDom static library. \
The goal of the Dom library is to provide a nicer to use basis for the \
Qml Code model, to be used by the various QML tools, the designer and \
the new compiler."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmldom-devel-static-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "9ee89ef8607250742ad3e3ac2d8a1475e177ef1cd3f84539a472b88852aec2ddf9a4c225e90a2d1b1f6778174e8ec19933923a44418c1248596f93174e13ed66"

RPROVIDES:${PN} += "cmake-Qt6QmlDomPrivate \
qt6-qmldom-devel-static \
qt6-qmldom-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlCompilerPrivate \
qt6-qml-private-devel"

inherit rpm
