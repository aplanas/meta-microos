SUMMARY = "Non-ABI stable API for the Qt 6 QmlWorkerScript library"
DESCRIPTION = "This package provides private headers of libQt6QmlWorkerScript that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlworkerscript-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "38b00ef1e005a2eb519a30c946b414143fdee4b59b389b9750e5b9cb2902878b4e01bf510e6ec5c37a9ea83f482c89c39bb47bfe34c4711969dc36ca8136a0b3"

RPROVIDES:${PN} += "qt6-qmlworkerscript-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlWorkerScript \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
