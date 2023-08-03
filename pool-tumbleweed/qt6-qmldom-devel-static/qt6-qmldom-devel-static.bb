SUMMARY = "Qt6 QmlDom static library"
DESCRIPTION = "The Qt6 QmlDom static library. \
The goal of the Dom library is to provide a nicer to use basis for the \
Qml Code model, to be used by the various QML tools, the designer and \
the new compiler."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmldom-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "eaa91b381e3f364ea211c9953968dc52d0ad0ccc9d5d3110afa3cc44d6189d5034e6ec7bda01423f42eedc5dc5bea7dbf4f6a4f7570aaf3e62552fbb40a29ab6"

RPROVIDES:${PN} += "cmake-Qt6QmlDomPrivate \
qt6-qmldom-devel-static \
qt6-qmldom-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlCompilerPrivate \
qt6-qml-private-devel"

inherit rpm
