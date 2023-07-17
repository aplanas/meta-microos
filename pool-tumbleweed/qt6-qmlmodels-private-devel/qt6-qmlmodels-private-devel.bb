SUMMARY = "Non-ABI stable API for the Qt 6 QmlModels library"
DESCRIPTION = "This package provides private headers of libQt6QmlModels that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlmodels-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "54cf1a676a56a0854d613922f61d700bc5ecf527a687d89a118ad055c35ce13c0bc4b5c6faf4dfda616cc045d28a617517f522c485e7ee05b2f0d506bbe4e126"

RPROVIDES:${PN} += "qt6-qmlmodels-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlModels \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
