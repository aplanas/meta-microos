SUMMARY = "Non-ABI stable API for the Qt 6 QmlLocalStorage library"
DESCRIPTION = "This package provides private headers of libQt6QmlLocalStorage that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmllocalstorage-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "c878660071bc5fa691ea361200302e5327d36184e7f2efd552585ec4cb2d54b984b203491ad87a38f069d99b5f76dcd6a21c6c95cc779178cb3da503bee7ddb2"

RPROVIDES:${PN} += "qt6-qmllocalstorage-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlLocalStorage \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
