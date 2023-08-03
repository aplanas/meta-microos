SUMMARY = "Qt 6 QmlCompiler library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmlcompiler-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "13da5a4c36fc9808d099f68e4bbbd1fefd42d59aaa2b6f8bcdaa21217d72fee4289a0606d459822f58df1ee1b32a25fffe3cf3748d26a22584472656d7e59fe9"

RPROVIDES:${PN} += "cmake-Qt6QmlCompilerPrivate \
qt6-qmlcompiler-devel-static \
qt6-qmlcompiler-private-devel"

RDEPENDS:${PN} += "libQt6QmlCompiler6 \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
