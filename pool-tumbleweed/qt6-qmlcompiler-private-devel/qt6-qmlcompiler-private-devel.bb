SUMMARY = "Qt 6 QmlCompiler library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlcompiler-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "e4aeb5510ad20ff315d6aa377dda7e83a8d9fd632c6d1ba1a4b6f67388ee3617794a93c1393b7087373923d9e11c5e6b562ac1b49182fa2c65461ab5a386b31f"

RPROVIDES:${PN} += "cmake-Qt6QmlCompilerPrivate \
qt6-qmlcompiler-devel-static \
qt6-qmlcompiler-private-devel"

RDEPENDS:${PN} += "libQt6QmlCompiler6 \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
