SUMMARY = "Qt6 QmlDom static library"
DESCRIPTION = "The Qt6 QmlDom static library. \
The goal of the Dom library is to provide a nicer to use basis for the \
Qml Code model, to be used by the various QML tools, the designer and \
the new compiler."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmldom-devel-static-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "75f71e2f7ab545516967e74ee91c480b2eace10cd9662e96c80ac40178bd123fac69beb6045e674a3d8bd042db5db2d0ff7880cff89e0d0472f589f051bc3090"

RPROVIDES:${PN} += "cmake(Qt6QmlDomPrivate) \
qt6-qmldom-devel-static \
qt6-qmldom-devel-static(aarch-64) \
qt6-qmldom-private-devel"
RDEPENDS:${PN} += "cmake(Qt6QmlCompilerPrivate) \
qt6-qml-private-devel"

inherit rpm
