SUMMARY = "Qt 6 QmlCompiler library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-qmlcompiler-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "5c16f456c723e6f296c6e06ccf7e696076f10000a8cfe440802cbe6f75076ff057042b2fb03ee6854af1bf335726e9dffcb6c454d1ae24d52aaf0b46acf44615"

RPROVIDES:${PN} += "cmake-Qt6QmlCompilerPrivate \
qt6-qmlcompiler-devel-static \
qt6-qmlcompiler-private-devel"

RDEPENDS:${PN} += "libQt6QmlCompiler6 \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
