SUMMARY = "Qt 6 QmlCompiler library - Development files"
DESCRIPTION = "Development files for the Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlcompiler-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "01aab4b5f5b99993f3358fab791c80cbd35fab136f470c2d065c87e375cecbbdb3f1c1ef0421bccf21c8b59d9413bad02870a9dc3d76ab256329b34ee7dc29e5"

RPROVIDES:${PN} += "cmake-Qt6QmlCompilerPrivate \
qt6-qmlcompiler-devel-static \
qt6-qmlcompiler-private-devel"

RDEPENDS:${PN} += "libQt6QmlCompiler6 \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
