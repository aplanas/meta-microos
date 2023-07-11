SUMMARY = "Non-ABI stable API for the Qt 6 QmlLocalStorage library"
DESCRIPTION = "This package provides private headers of libQt6QmlLocalStorage that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmllocalstorage-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "50bb2ce0e0c8d4a0172308ec709769796d05c4de903b4c9daa4f9c0ea6ed7afa8c5dd32a4c25aabcc7799cbe8cd7a4ba1d0c67e17133ecd94a609ef889b47252"

RPROVIDES:${PN} += "qt6-qmllocalstorage-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlLocalStorage \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
