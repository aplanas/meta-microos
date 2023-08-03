SUMMARY = "Non-ABI stable API for the Qt 6 QmlLocalStorage library"
DESCRIPTION = "This package provides private headers of libQt6QmlLocalStorage that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-qmllocalstorage-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2f7ae75b4ee5f5218b844a0d0a677b057b532a8f0f4a131e28a150a0fd67d8d195c49c2275c2dd8488915590b3a6d9888dc39be02f9ba597529d858fc1dcdca6"

RPROVIDES:${PN} += "qt6-qmllocalstorage-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlLocalStorage \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
