SUMMARY = "Non-ABI stable API for the Qt 6 QmlWorkerScript library"
DESCRIPTION = "This package provides private headers of libQt6QmlWorkerScript that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmlworkerscript-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "04f136bc81fadf14f574d29a34d154ace7dd047ab3981028e80963d0fcf86cfa80796ff7ba87903b01ae48732c412ad315105010fff5877562c4b9ed2860975a"

RPROVIDES:${PN} += "qt6-qmlworkerscript-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QmlWorkerScript \
qt6-core-private-devel \
qt6-qml-private-devel"

inherit rpm
