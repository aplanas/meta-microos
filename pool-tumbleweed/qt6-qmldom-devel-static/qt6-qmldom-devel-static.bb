SUMMARY = "Qt6 QmlDom static library"
DESCRIPTION = "The Qt6 QmlDom static library. \
The goal of the Dom library is to provide a nicer to use basis for the \
Qml Code model, to be used by the various QML tools, the designer and \
the new compiler."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmldom-devel-static-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "3f20cc3a1b6809dfe381d268d56bef3db9b67f82c7454169a20b5215c379f5f9c0a48787acaf66c9a10933d85042f2470fbcb6c4a0af0c2f90cd514fd858fc29"

RPROVIDES:${PN} += "cmake-Qt6QmlDomPrivate \
qt6-qmldom-devel-static \
qt6-qmldom-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlCompilerPrivate \
qt6-qml-private-devel"

inherit rpm
